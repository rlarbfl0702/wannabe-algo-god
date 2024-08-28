import java.io.*;
import java.util.*;
import java.awt.*;

public class Main {

    static int n;
    static int m;
    static int map[][];
    static int result[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int end_x;
    static int end_y;
    static boolean visited[][];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 행
        n = Integer.parseInt(st.nextToken());
        // 열
        m = Integer.parseInt(st.nextToken());

        // 길을 저장할 지도
        map = new int[n][m];
        // 목표지점까지 갈 거리를 저장할 2차원 배열
        result = new int[n][m];

        // 도착지점의 x, y 좌표값
        end_x = 0;
        end_y = 0;

        // 방문처리 저장할 배열
        visited = new boolean[n][m];

        // 지도에 길 저장
        for(int i = 0; i < n; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++){
                int r = Integer.parseInt(st2.nextToken());

                // 만약 입력값이 2라면 도착지점 변수에 저장
                if(r == 2){
                    end_x = i;
                    end_y = j;
                }

                map[i][j] = r;
            }
        }

        // 목표지점 좌표값으로 BFS를 돌림
        BFS(end_x, end_y);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // 만약 아직 방문하지 않은 좌표값이 1이라면
                // 목표지점에서 시작지점까지 갈 수 없다는 뜻이므로
                // 결과값을 -1로 저장
                if(!visited[i][j] && (map[i][j] == 1)){
                    result[i][j] = -1;
                }

                sb.append(result[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();

        // 시작지점을 Queue에 넣어줌
        q.offer(new Point(x, y));

        // 목표지점을 방문처리하고
        visited[x][y] = true;
        // 결과값 배열에 목표지점 값을 0으로 저장
        result[x][y] = 0;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int xx = q.peek().x;
            int yy = q.peek().y;

            // Queue에서 빼줌
            q.poll();

            for(int i = 0; i < 4; i++){
                // 기준 좌표값에서 상하좌우 이동한 값
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 이동한 좌표값이 배열 범위를 넘어간다면 continue
                if(nx >= n || nx < 0 || ny >= m || ny < 0){
                    continue;
                }

                // 만약 이동한 좌표를 방문하지 않았고 배열의 값이 1이라면
                if(!visited[nx][ny] && (map[nx][ny] == 1)){
                    // 이동한 좌표값에 위치하는 결과값 배열에
                    // 기준 좌표값 위치의 값에 + 1 더한값을 저장하고
                    result[nx][ny] = result[xx][yy] + 1;
                    // 방문처리 해줌
                    visited[nx][ny] = true;
                    // 마무리로 Queue에 이동한 좌표값을 넣어줌
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }
}
