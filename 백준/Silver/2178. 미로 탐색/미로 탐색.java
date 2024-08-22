import java.io.*;
import java.util.*;
import java.awt.*;

public class Main {

    static int N;
    static int M;
    static int map[][];
    static boolean visited[][];
    static int road[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 행
        N = Integer.parseInt(st.nextToken());
        // 열
        M = Integer.parseInt(st.nextToken());
        // 지도
        map = new int[N][M];
        // 방문 처리
        visited = new boolean[N][M];
        // 이동한 횟수를 저장할 배열
        road = new int[N][M];

        // 지도에 벽과 길을 입력
        for(int i = 0; i < N; i++){
            String s = br.readLine();

            for(int j = 0; j < M; j++){
                int n = Integer.parseInt(s.split("")[j]);
                map[i][j] = n;
            }
        }

        // 시작점인 (0, 0)부터 BFS를 돌림
        BFS(0, 0);

        System.out.println(road[N - 1][M - 1]);
    }

    public static void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();

        // 시작지점 Queue에 넣음
        q.offer(new Point(x, y));

        // 해당 좌표를 방문처리하고
        visited[x][y] = true;

        // 해당 좌표값의 이동 횟수를 1로 저장
        road[x][y] = 1;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int xx = q.peek().x;
            int yy = q.peek().y;

            q.poll();

            // Queue에서 꺼낸 좌표가 도착지라면 종료
            if((xx == (N - 1)) && (yy == (M - 1))){
                break;
            }

            for(int i = 0; i < 4; i++){
                // 상하좌우로 이동한 좌표값
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 배열 범위를 넘어간다면 continue
                if(nx >= N || nx < 0 || ny >= M || ny < 0){
                    continue;
                }

                // 만약 해당 좌표값을 방문하지 않았고 값이 1이라면
                if(!visited[nx][ny] && (map[nx][ny] == 1)){
                    // 상하좌우로 이동한 좌표값의 이동 횟수를
                    // 이동하기 전 좌표값의 이동 횟수에서 1 더한 값으로 저장
                    road[nx][ny] = road[xx][yy] + 1;
                    // 이동한 좌표값을 방문처리 후
                    visited[nx][ny] = true;
                    // Queue에 이동한 좌표값을 넣음
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }
}
