import java.io.*;
import java.util.*;

public class Main {

    public static int N, M;
    public static int start_x, start_y, now_d;
    public static int[][] map;
    public static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    public static int[] dy = {0, 1, 0, -1};
    public static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        start_x = Integer.parseInt(st2.nextToken());
        start_y = Integer.parseInt(st2.nextToken());
        now_d = Integer.parseInt(st2.nextToken());

        result = 0;
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st3.nextToken());
            }
        }

        BFS(start_x, start_y);
        System.out.println(result);
    }

    public static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void BFS(int sx, int sy) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(sx, sy));

        while (!q.isEmpty()) {
            Node n = q.poll();

            int x = n.x;
            int y = n.y;

            // 현재 위치 청소
            if (map[x][y] == 0) {
                // 청소 완료 표시
                map[x][y] = 2;

                result = result + 1;
            }

            boolean found = false;

            for(int i = 0; i < 4; i++) {
                // 반시계 방향으로 회전한 방향
                now_d = (now_d + 3) % 4;

                int nx = x + dx[now_d];
                int ny = y + dy[now_d];

                // 회전한 방향으로 진전한 좌표가 범위를 넘어가지 않고
                // 벽이 아닌 이동할 수 있는 칸이라면
                if((nx >= 0 && nx < N && ny >= 0 && ny < M) && map[nx][ny] == 0){
                    // 큐에 해당 좌표를 넣고
                    q.add(new Node(nx, ny));

                    // 찾았다는 표시 후, 방향 반복문 탈출
                    found = true;
                    break;
                }
            }

            // 만약 네 방향 모두 돌았는데 진전할 수 없는 경우라면
            if (!found) {
                // 후진했을 때, 좌표
                int back_x = x - dx[now_d];
                int back_y = y - dy[now_d];

                // 후진한 좌표가 범위를 넘어가지 않고
                // 벽이 아니라면
                if ((back_x >= 0 && back_x < N && back_y >= 0 && back_y < M) && map[back_x][back_y] != 1) {
                    // 큐에 후진한 좌표를 넣음
                    q.add(new Node(back_x, back_y));
                }
                // 후진이 불가능하면 작동을 종료
                else {
                    break;
                }
            }
        }
    }
}
