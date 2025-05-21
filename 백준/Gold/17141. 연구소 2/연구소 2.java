import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int v;
    public static int map[][];
    public static boolean visited[][];
    public static int result;
    public static List<Node> virusList;
    public static Node selected[];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        // 지도
        map = new int[N][N];
        visited = new boolean[N][N];

        result = Integer.MAX_VALUE;

        // 바이러스를 놓을 수 있는 좌표를 저장할 리스트
        virusList = new ArrayList<>();

        // 조합으로 선택된 바이러스 좌표
        selected = new Node[v];

        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++){
                int n = Integer.parseInt(st2.nextToken());

                map[i][j] = n;

                if(n == 2){
                    virusList.add(new Node(i, j, 0));
                }
            }
        }

        // 바이러스 좌표 조합
        DFS(0, 0);

        // 현재 결과값이 Integer 최대값이라면 현재 지도로
        // 모든 빈 칸에 바이러스를 퍼뜨릴 수 없다는 뜻이므로
        if(result == Integer.MAX_VALUE){
            // -1을 출력
            System.out.println(-1);
        }
        // 아니라면
        else{
            // 결과값을 출력
            System.out.println(result);
        }
    }

    public static class Node{
        int x;
        int y;
        int time;

        public Node(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    // 바이러스 좌표 중 M개 선택하는 조합 함수
    public static void DFS(int d, int s) {
        if(d == v){
            // 선택된 바이러스로 BFS 실행
            visited = new boolean[N][N];
            BFS();
            return;
        }

        // 바이러스 목록들 중에서
        for(int i = s; i < virusList.size(); i++){
            // 바이러스를 놓는 개수만큼 조합
            selected[d] = virusList.get(i);
            DFS(d + 1, i + 1);
        }
    }


    public static void BFS(){
        Queue<Node> q = new LinkedList<>();

        // 각 칸에 바이러스가 퍼지는 시간 기록
        int timeMap[][] = new int[N][N];

        // 조합된 바이러스 좌표를 Queue에 넣고 해당 좌표를 방문처리
        for(Node n : selected){
            q.add(new Node(n.x, n.y, 0));
            visited[n.x][n.y] = true;
        }

        int maxTime = 0;

        while(!q.isEmpty()){
            Node node = q.poll();

            int xx = node.x;
            int yy = node.y;
            int tt = node.time;

            // 상하좌우 움직인 좌표값이
            for(int i = 0; i < 4; i++){
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 지도의 범위를 넘어가면 continue
                if(nx >= N || nx < 0 || ny >= N || ny < 0){
                    continue;
                }

                // 이동한 좌표가 유효한 좌표값일 경우,
                // 만약 해당 좌표를 방문하지 않았고 바이러스가 움직일 수 있는 칸이라면
                if(!visited[nx][ny] && map[nx][ny] != 1){
                    // 해당 좌표를 방문처리하고
                    visited[nx][ny] = true;
                    // 바이러스가 해당칸에 이동하는데 걸린
                    // 시간을 저장할 배열에 현재 시간 + 1을 저장
                    timeMap[nx][ny] = tt + 1;
                    // 그리고 해당 좌표와 해당 좌표에 바이러스가 옮겨지기까지 걸린 시간을 Queue에 삽입
                    q.add(new Node(nx, ny, tt + 1));
                }
            }
        }
        // 연구소의 모든 빈 칸에 바이러스를 퍼트릴 수 있는지 판단할 변수
        boolean TF = true;

        // 바이러스의 이동이 다 끝나고 난 후
        // 모든 좌표를 돌았을 때
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                // 방문하지 않은 빈 공간이 있다면
                // 바이러스를 모든 곳에 옮길 수 없다는 뜻이므로 break
                if (map[i][j] != 1) {
                    if (!visited[i][j]) {
                        TF = false;
                        break;
                    }
                    // 해당 좌표값에 바이러스가 이동하는 시간과
                    // 현재 저장된 바이러스가 이동하는데 걸린 시간을 비교하여 더 큰 값을
                    // 결과값에 저장
                    maxTime = Math.max(maxTime, timeMap[i][j]);
                }
            }
        }

        // 만약 연구소의 모든 빈 칸에 바이러스를 퍼트릴 수 있다면
        if(TF){
            // 현 경우에서 바이러스를 퍼트리는데 걸린 시간이
            // 최종 결과값을 갱신
            if(maxTime < result){
                result = maxTime;
            }
        }
    }
}
