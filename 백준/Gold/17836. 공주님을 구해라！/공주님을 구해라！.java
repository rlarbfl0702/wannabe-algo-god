import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int T;
    public static boolean visitied[][][];
    public static int map[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        // 지도 정보
        map = new int[N][M];
        // 방문 여부를 저장할 배열
        visitied = new boolean[N][M][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++){
                int n = Integer.parseInt(st2.nextToken());

                // 지도 정도 입력
                map[i][j] = n;
            }
        }

        // 결과값을 Integer 최댓값으로 초기화
        result = Integer.MAX_VALUE;

        BFS(0, 0);

        if(result == Integer.MAX_VALUE){
            System.out.println("Fail");
        }
        else{
            System.out.println(result);
        }
    }

    public static class Node{
        int x;
        int y;
        int d;
        boolean g;

        public Node(int x, int y, int d, boolean g){
            this.x = x;
            this.y = y;
            this.d = d;
            this.g = g;
        }
    }

    public static void BFS(int x, int y){
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(x, y, 0, false));

        while(!q.isEmpty()){
            Node n = q.poll();

            // 좌표 정보
            int xx = n.x;
            int yy = n.y;
            // 걸린 시간
            int d = n.d;
            // 명검의 여부
            boolean g = n.g;

            // 만약 걸린 시간이 제한시간을 넘었다면 공주를 구할 수 없으므로 반복문 종료
            if(d > T){
                break;
            }

            // 만약 좌표 정보가 지도의 끝부분이라면 공주님을 구했으므로
            // 걸린 시간을 결과값에 저장 후, 반복문을 종료
            if((xx == N - 1) && (yy == M - 1)){
                result = d;
                break;
            }

            for(int i = 0; i < 4; i++){
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 이동한 좌표가 지도를 넘어간다면 continue
                if(nx >= N || nx < 0 || ny >= M || ny < 0){
                    continue;
                }

                // 만약 명검을 구했으면 벽이라도 통과할 수 있으므로
                if(g){
                    if(!visitied[nx][ny][1]){
                        // 해당 좌표를 방문 처리하고
                        visitied[nx][ny][1] = true;
                        // Queue에 해당 좌표를 넣음
                        q.add(new Node(nx, ny, d + 1, true));
                    }
                }
                // 아직 명검을 구하지 못했다면
                else{
                    // 이동한 좌표가 벽이 아니고 방문한 적이 없을 때만 이동이 가능하므로
                    if((map[nx][ny] != 1) && !visitied[nx][ny][0]){

                        // 해당 좌표에서 명검을 얻었는지 처리할 변수
                        boolean ng = false;

                        // 만약 해당 좌표가 2일 경우, 명검을 찾았다는 뜻이므로
                        // ng를 true로 바꿈
                        if(map[nx][ny] == 2){
                            ng = true;
                        }

                        // 만약 명검을 찾았을 경우, 해당 좌표의 명검을 찾았을 때 경우를 방문처리
                        if(ng){
                            visitied[nx][ny][1] = true;
                        }
                        // 못 찾았을 경우, 못 찾았을 경우를 방문처리함
                        else{
                            visitied[nx][ny][0] = true;
                        }

                        // 새로운 좌표와 현재 위치에서 1늘어난 시간을 Queue에 넣음
                        q.add(new Node(nx, ny, d + 1, ng));
                    }
                }
            }
        }
    }
}

