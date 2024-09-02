import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int M;
    static int N;
    static int map[][];
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int days;
    static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 행
        M = Integer.parseInt(st.nextToken());
        // 열
        N = Integer.parseInt(st.nextToken());

        // 익어야되는 토마토가 있는지 판단할 변수
        boolean isTomato = false;

        // 토마토 저장할 배열
        map = new int[N][M];
        // 방문 여부 저장할 배열
        visited = new boolean[N][M];
        // 계산할 날짜 변수
        days = 0;

        // 토마토 입력
        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++){
                int n = Integer.parseInt(st2.nextToken());

                // 만약 입력이 0이라면 익혀야되는 토마토가 있다는 뜻이므로
                // 변수를 true로 바꿔줌
                if(n == 0){
                    isTomato = true;
                }

                // 입력이 1이면 토마토가 있다는 뜻이므로 Queue에
                // 해당 위치를 넣어주고 방문처리
                if(n == 1){
                    q.offer(new Point(i, j));
                    visited[i][j] = true;
                }

                map[i][j] = n;
            }
        }

        if(!isTomato){
            System.out.println(0);
        }
        else{
            // 모두 익힐 수 있는 상황인지 판단할 변수
            boolean TF = true;

            BFS();

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    // 만약 BFS를 돌렸는데 아직 0이 있다면
                    // 모두 못 익혔으므로 TF를 false로 바꾸고 반복문 종료
                    if(map[i][j] == 0){
                        TF = false;
                        break;
                    }
                }
            }

            // 만약 TF가 true이면 모두 익힐 수 있다는 뜻이므로 날짜 출력
            if(TF){
                System.out.println(days);
            }
            // TF가 false라면 모두 익힐 수 없다는 뜻이므로 -1 출력
            else{
                System.out.println(-1);
            }
        }
    }

    public static void BFS(){
        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            // Queue의 크기
            int size = q.size();
            // 새로운 토마토가 생겼는지 판단할 변수
            boolean change = false;

            // 기존의 Queue 크기만큼 반복
            for(int i = 0; i < size; i++){
                int xx = q.peek().x;
                int yy = q.peek().y;

                q.poll();

                // Queue에서 꺼낸 좌표를 기준으로
                // 상하좌우로 이동
                for(int j = 0; j < 4; j++){
                    int nx = xx + dx[j];
                    int ny = yy + dy[j];

                    // 이동한 좌표가 범위를 초과한다면 continue
                    if(nx >= N || nx < 0 || ny >= M || ny < 0){
                        continue;
                    }

                    // 만약 이동한 좌표가 0이고 방문하지 않았다면
                    if((map[nx][ny] == 0) && !visited[nx][ny]){
                        // 해당좌표를 1로 바꾸고
                        map[nx][ny] = 1;
                        // 방문처리를 한 후,
                        visited[nx][ny] = true;
                        // Queue에 넣음
                        q.offer(new Point(nx, ny));
                        // 그리고 새로운 토마토가 생겼으므로 true로 바꿈
                        change = true;
                    }
                }
            }

            // 그리고 새로운 토마토가 생겼으면 날짜 + 1
            if(change){
                days = days + 1;
            }
        }
    }
}
