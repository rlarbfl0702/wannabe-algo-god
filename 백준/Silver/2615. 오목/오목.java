import java.io.*;
import java.util.*;

public class Main {
    public static int[][] map;
    public static int[] dx = {0, 1, 1, -1}; // 오른쪽, 아래, 우하향 대각선, 좌하향 대각선
    public static int[] dy = {1, 0, 1, 1}; // 4방향만 검사 (반대 방향은 검사하지 않음)

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[19][19];

        for (int i = 0; i < 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 19; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (map[i][j] != 0) {
                    int winner = map[i][j];
                    for (int d = 0; d < 4; d++) { // 4방향만 검사
                        if (checkWin(i, j, d, winner)) {
                            System.out.println(winner);
                            System.out.println((i + 1) + " " + (j + 1));
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(0);
    }

    public static boolean checkWin(int x, int y, int d, int color) {
        int count = 1;
        int nx = x + dx[d];
        int ny = y + dy[d];

        // 정방향으로 탐색 (같은 색의 돌이 연속되는지 확인)
        while (isValid(nx, ny) && map[nx][ny] == color) {
            count++;
            nx += dx[d];
            ny += dy[d];
        }

        // 반대 방향으로 탐색 (6개 이상 연속되는지 확인)
        nx = x - dx[d];
        ny = y - dy[d];
        while (isValid(nx, ny) && map[nx][ny] == color) {
            count++;
            nx -= dx[d];
            ny -= dy[d];
        }

        // 정확히 5개여야 함 (6개 이상이면 false)
        if (count != 5) return false;

        // 6개 이상 연속된 경우를 체크 (반대 방향에 돌이 있는지 확인)
        int prevX = x - dx[d];
        int prevY = y - dy[d];
        if (isValid(prevX, prevY) && map[prevX][prevY] == color) {
            return false; // 6개 이상이면 false
        }

        // 가장 왼쪽(세로 방향이면 가장 위쪽) 돌 찾기
        int startX = x, startY = y;
        while (isValid(startX - dx[d], startY - dy[d]) && map[startX - dx[d]][startY - dy[d]] == color) {
            startX -= dx[d];
            startY -= dy[d];
        }

        return true;
    }

    public static boolean isValid(int x, int y) {
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }
}
