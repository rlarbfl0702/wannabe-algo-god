import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int map[][];
    public static boolean visited[][];
    public static Queue<Node> v;
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        // 바이러스의 좌표를 저장할 Queue
        v = new LinkedList<>();

        // 결과값
        result = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++){
               int n = Integer.parseInt(st2.nextToken());

               map[i][j] = n;

               // 만약 값이 2면 바이러스 좌표를 array에 저장
               if(n == 2){
                   v.add(new Node(i, j));
               }
            }
        }

        dfs(0, 3);

        System.out.println(result);
    }

    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void dfs(int n, int d){
        // 만약 벽을 3개 만들었다면
        if(n == d){
            // 해당 지도로 bfs를 돌려서 바이러스 수를 체크
            bfs(map);

            return;
        }

        // 맵을 돌면서 벽이 아니고 바이러스가 없는 곳에
        // 벽을 3개 세우는 경우의 수를 탐색
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                // 만약 해당 해당 지도 값이 빈칸이라면
                if(map[i][j] == 0){
                    // 해당 칸을 벽으로 바꾸고
                    map[i][j] = 1;

                    // 해당 지도로 dfs를 돌림
                    dfs(n + 1, d);

                    // 그리고 다시 해당 칸을 다시 0으로 바꿈
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void bfs(int m[][]){
        Queue<Node> q = new LinkedList<>();

        // 바이러스의 좌표를 Queue에 추가
        for(Node virus : v){
            q.add(new Node(virus.x, virus.y));
        }

        // 바뀐 맵의 복사본을 저장할 배열
        int copy[][] = new int[N][M];

        for(int i = 0; i < N; i++){
            copy[i] = map[i].clone();
        }

        while(!q.isEmpty()){
            Node node = q.poll();

            int xx = node.x;
            int yy = node.y;

            // 현재 좌표를 방문 처리
            visited[xx][yy] = true;

            for(int i = 0; i < 4; i++){
                // 상하좌우 이동한 좌표값
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 이동한 좌표가 해당 맵의 범위를 넘어간다면 continue
                if(nx >= N || nx < 0 || ny >= M || ny < 0){
                    continue;
                }

                // 만약 이동한 좌표가 비어있다면
                // 해당 좌표는 바이러스와 인접한 빈 좌표값이기 때문에
                // 바이러스 전염이 가능하므로 해당 좌표값을 2로 바꾸고
                if(copy[nx][ny] == 0){
                    copy[nx][ny] = 2;

                    // 해당 좌표를 Queue에 넣음
                    q.add(new Node(nx, ny));
                }
            }
        }

        // 해당 맵으로 돌렸을 때, 안전영역의 개수를 저장할 변수
        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(copy[i][j] == 0){
                    cnt = cnt + 1;
                }
            }
        }

        // 만약 해당 맵의 안전영역의 개수가 현재 결과값보다 더 크다면
        if(cnt >= result){
            // 결과값을 갱신
            result = cnt;
        }
    }
}

