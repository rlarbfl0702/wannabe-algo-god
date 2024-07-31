import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static boolean field[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    static int M;

    static int N;

    static int cnt;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 배추밭 가로 길이
            M = Integer.parseInt(st.nextToken());

            // 배추밭 세로 길이
            N = Integer.parseInt(st.nextToken());

            // 배추가 심어져 있는 위치의 개수
            int K = Integer.parseInt(st.nextToken());

            field = new boolean[N][M];

            // 지렁이 개수 카운트할 변수
            cnt = 0;

            for(int i = 0; i < K; i++){
                StringTokenizer st2 = new StringTokenizer(br.readLine());

                int m = Integer.parseInt(st2.nextToken());
                int n = Integer.parseInt(st2.nextToken());

                // 입력받은 위치 값을 true로 변환 (배추가 있으므로)
                field[n][m] = true;
            }

            // 좌표값을 돌려가며 해당 좌표에 배추가 있으면
            // BFS를 돌림
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(field[i][j]){
                        BFS(i, j);

                        cnt = cnt + 1;
                    }
                }
            }

            sb.append(cnt + "\n");
        }

        System.out.println(sb);
    }

    static public void BFS(int i, int j){
        Queue<Point> q = new LinkedList<>();

        // Queue 값에 x,y값을 넣어줌
        q.offer(new Point(i, j));

        while(!q.isEmpty()){
            // x, y값을 변수에 저장
            int nx = q.peek().x;
            int ny = q.peek().y;

            q.poll();

            for(int d = 0; d < 4; d++){
                int mx = nx + dx[d];
                int my = ny + dy[d];

                // 만약 배열의 범위를 넘어설 경우, continue
                if(mx >= N || mx < 0 || my >= M || my < 0){
                    continue;
                }

                // 만약 이동한 지역에 배추가 있다면
                if(field[mx][my]){
                    // 그 지역 값을 false로 바꿔주고
                    field[mx][my] = false;

                    // 그 좌표값을 Queue에 넣어줌
                    q.offer(new Point(mx, my));
                }
            }
        }
    }
}
