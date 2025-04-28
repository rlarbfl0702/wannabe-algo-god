import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static Queue<Node> q;
    public static int map[][];
    public static boolean visited[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int time;
    public static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 치즈의 좌표를 저장할 배열
        map = new int[N][M];
        // 방문 처리를 저장할 배열
        visited = new boolean[N][M];

        // 치즈의 좌표를 저장할 Queue
        q = new LinkedList<>();

        // 치즈가 모두 녹아서 없어지는데 걸리는 시간
        time = 0;

        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++){
                int c = Integer.parseInt(st2.nextToken());

                map[i][j] = c;

                // 해당 좌표가 치즈라면 해당 좌표를 Queue에 저장
                if(c == 1){
                    q.add(new Node(i, j));
                }
            }
        }

        // 현재 치즈의 개수
        cnt = q.size();

        BFS();

        System.out.println(time);
        System.out.println(cnt);
    }

    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void BFS(){
        Queue<Node> next = new LinkedList<>();

        // 다 녹기 한시간 전 치즈 개수
        int precnt = cnt;

        while(!q.isEmpty()){
            precnt = cnt;

            // 매번 외부 공기를 새로 체크하기 위해 visited를 초기화
            visited = new boolean[N][M];

            // 외부 공기 찾기 위한 Queue
            Queue<Node> air = new LinkedList<>();

            air.add(new Node(0, 0));

            visited[0][0] = true;

            // 외부 공기 표시
            while(!air.isEmpty()){
                Node node = air.poll();
                int xx = node.x;
                int yy = node.y;

                for(int i = 0; i < 4; i++){
                    int nx = xx + dx[i];
                    int ny = yy + dy[i];

                    if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                        // 만약 해당 좌표가 외부 공기라면
                        if(!visited[nx][ny] && map[nx][ny] == 0){
                            // 방문 처리 후
                            visited[nx][ny] = true;
                            // Queue에 해당 좌표를 넣음
                            air.add(new Node(nx, ny));
                        }
                    }
                }
            }

            // 현재 치즈중에 녹는 치즈를 세기 위한 반복문
            for(int i = 0; i < cnt; i++){
                Node node = q.poll();

                // 현재 치즈의 좌표
                int xx = node.x;
                int yy = node.y;

                // 녹을지 안녹을지 판단할 변수
                boolean m = false;

                // 상하좌우 탐색을 해서
                for(int j = 0; j < 4; j++){
                    int nx = xx + dx[j];
                    int ny = yy + dy[j];

                    // 해당 좌표가 범위를 넘어가면 continue
                    if(nx >= N || nx < 0 || ny >= M || ny < 0){
                        continue;
                    }

                    // 만약 상하좌우에 외부 공기가 있다면
                    if(visited[nx][ny]){
                        m = true;
                    }
                }

                // 만약 해당 좌표의 치즈가 녹는다면
                if(m){
                    map[xx][yy] = 0;
                }
                // 녹지 않는다면
                else{
                    next.add(new Node(xx, yy));
                }
            }

            // 위의 치즈 녹이는 과정을 한 후, 시간 + 1
            time = time + 1;

            // 만약 위의 치즈 녹이는 과정 뒤, Queue에 있던 치즈가 다 없어진다면
            if(next.isEmpty()){
                break;
            }

            // 만약 치즈가 다 녹지 않았다면
            q = next;

            // 현재 남은 치즈의 개수를 cnt로 갱신
            cnt = q.size();
            next = new LinkedList<>(); // 다음 queue 초기화
        }

        // cnt값을 precnt로 갱신
        cnt = precnt;
    }
}
