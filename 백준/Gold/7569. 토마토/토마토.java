import java.io.*;
import java.util.*;

class Node{
    int x, y, z;

    Node(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Main {

    static int M;
    static int N;
    static int H;
    static int map[][][];
    static boolean visited[][][];
    static Queue<Node> q = new LinkedList<>();
    static int dx[] = {-1, 1, 0, 0, 0, 0};
    static int dy[] = {0, 0, -1, 1, 0, 0};
    static int dz[] = {0, 0, 0, 0, -1, 1};
    static int days;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 열
        M = Integer.parseInt(st.nextToken());
        // 행
        N = Integer.parseInt(st.nextToken());
        // 높이
        H = Integer.parseInt(st.nextToken());

        // 길 정보
        map = new int[H][N][M];
        // 방문 처리
        visited = new boolean[H][N][M];
        // 걸리는 날짜를 저장하는 변수
        days = 0;

        // 저장될 때부터 모든 토마토가 익어있는 상태인지 판별할 변수
        boolean tomato = false;

        for(int i = 0; i < H; i++){
            for(int j = 0; j < N; j++){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++){
                    int n = Integer.parseInt(st2.nextToken());

                    // 입력이 0이 오면 익어야하는 토마토가 있어야된다는 뜻이므로
                    // 변수를 true로 바꿔줌
                    if(n == 0){
                        tomato = true;
                    }

                    // 만약 입력이 1이 오면 익은 토마토의 위치를 넣어야되므로
                    if(n == 1){
                        // Queue에 해당 좌표를 넣고
                        q.offer(new Node(i, j, k));
                        // 방문 처리함
                        visited[i][j][k] = true;
                    }

                    // 3차원 배열에 값을 넣음
                    map[i][j][k] = n;
                }
            }
        }

        // 저장될 때부터 모든 토마토가 익어있다면
        if(!tomato){
            // 0을 출력
            System.out.println(0);
        }
        // 저장될 때부터 모든 토마토가 익어있지 않다면
        else{
            BFS();

            // 토마토가 다 익었는지 판단할 변수
            boolean TF = true;

            for(int i = 0; i < H; i++){
                for(int j = 0; j < N; j++){
                    for(int k = 0; k < M; k++){
                        // 만약 지도를 돌았을 때, 0이 있다면
                        // 덜 익은 토마토가 있다는 뜻이므로 fasle로 변환
                        if(map[i][j][k] == 0){
                            TF = false;
                        }
                    }
                }
            }

            // 만약 다 익었다면 날짜수를 출력하고
            if(TF){
                System.out.println(days);
            }
            // 덜 익었다면 -1를 출력
            else{
                System.out.println(-1);
            }
        }
    }

    public static void BFS(){
        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            // Queue의 size만큼 반복하기 위해 저장
            // 하루가 지날 때, 익은 토마토의 개수가 저장되어있기 때문
            int size = q.size();
            // 익은 토마토의 기준으로 하루가 지나면서
            // 익은 토마토가 새로 생기는지 판단하기 위한 변수
            boolean change = false;

            for(int i = 0; i < size; i++){
                Node node = q.poll();
                // Queue에 있는 좌표값을 저장
                int zz = node.x;
                int xx = node.y;
                int yy = node.z;

                // 기준 좌표값에 대해 x, y값을 기준으로 상하좌우
                // z값을 기준으로 위아래 이동하는데
                for(int j = 0; j < 6; j++){
                    int nz = zz + dz[j];
                    int nx = xx + dx[j];
                    int ny = yy + dy[j];

                    // 범위를 벗어나면 continue
                    if(nx >= N || nx < 0 || ny >= M || ny < 0 || nz >= H || nz < 0){
                        continue;
                    }

                    // 만약 이동한 좌표를 방문하지 않았고 지도값이 0일 경우
                    if(!visited[nz][nx][ny] && (map[nz][nx][ny] == 0)){
                        // 해당 좌표값을 방문 처리하고
                        visited[nz][nx][ny] = true;
                        // 지도의 값을 1로 바꿈
                        map[nz][nx][ny] = 1;

                        // 그리고 Queue에 해당 좌표를 넣음
                        q.offer(new Node(nz, nx, ny));
                        // 그리고 익은 토마토가 새로 생겼으므로 변수를 true로 바꿈
                        change = true;
                    }
                }
            }

            // Queue에 있는 값들을 다 빼서 반복문을 돌리면 하루에
            // 익을 수 있는 토마토 개수를 다 셌고
            // 변수가 true이면 새로 생긴 토마토로 새로 익힐 토마토가
            // 있는지 확인해야 하므로 걸리는 날짜 + 1
            if(change){
                days = days + 1;
            }
        }
    }
}
