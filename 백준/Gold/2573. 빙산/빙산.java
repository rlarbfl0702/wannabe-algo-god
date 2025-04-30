import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int map[][];
    public static boolean visited[][];
    public static boolean visited2[][];
    public static Queue<Node> q;
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int year;
    public static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 지도
        map = new int[N][M];
        // 빙하가 모두 녹는지 판단하기 위한 방문 처리 배열
        visited = new boolean[N][M];
        // 빙하의 덩어리의 개수를 세기 위한 방문 처리 배열
        visited2 = new boolean[N][M];

        // 빙하가 분리되는 최초의 시간을 계산할 변수
        year = 0;

        // 빙산의 좌표를 저장할 Queue
        q = new LinkedList<>();

        // 좌표값 저장
        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++){
                int n = Integer.parseInt(st2.nextToken());

                map[i][j] = n;

                // 만약 해당 좌표값이 물이 아니라면 해당 좌표값을 Queue에 저장
                if(n != 0){
                    q.add(new Node(i, j));
                }
            }
        }

        melt();

        System.out.println(year);

    }

    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    // 빙산이 녹는걸 계산할 BFS
    public static void melt(){
        Queue<Node> bq = new LinkedList<>();

        int size = q.size();

        while(!q.isEmpty()){

            // 덩어리의 수를 0으로 초기화
            cnt = 0;
            // 빙산 덩어리 개수를 세기 위한 방문처리 배열을 초기화
            visited2 = new boolean[N][M];

            // 해당 지도에서 현재 빙산의 덩어리 개수를 카운트
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    // 만약 해당 좌표가 방문처리되지 않았고 물이 아닌 빙산이라면
                    if(!visited2[i][j] && (map[i][j] != 0)){
                        // 해당 좌표로 빙산 덩어리를 세기 위한 BFS를 돌림
                        count(i, j);
                    }
                }
            }

            // 만약 덩어리의 개수가 2 이상일 경우
            // break 하고 연도를 출력
            if(cnt >= 2){
                break;
            }
            // 만약 덩어리의 개수가 2 미만일 경우
            else{
                // 빙산이 다 녹지 않았다면 더 녹일 수 있으므로 연도 + 1
                year = year + 1;
            }

            size = q.size();

            // 빙산이 다 녹는 좌표인지 판단할 방문 처리 배열 초기화
            visited = new boolean[N][M];

            // 저장된 빙산의 좌표들을 계산
            for(int i = 0; i < size; i++){
                Node node = q.poll();

                int xx = node.x;
                int yy = node.y;

                // 물 부분 셀 변수
                int water = 0;

                // 상하좌우 탐색을 하면서 물 부분을 카운트
                for(int j = 0; j < 4; j++){
                    int nx = xx + dx[j];
                    int ny = yy + dy[j];

                    // 범위를 벗어나면 continue
                    if(nx >= N || nx < 0 || ny >= M || ny < 0){
                        continue;
                    }

                    // 만약 좌표값이 0이라면 물 개수 + 1
                    if(map[nx][ny] == 0){
                        water = water + 1;
                    }
                }

                // 만약 물 부분의 개수가 현재 위치의 빙산 높이보다 크다면
                if(water >= map[xx][yy]){
                    // 해당 좌표를 방문 처리 (모든 빙산을 방문하고 0으로 만들어야되기 때문에 일단 표시만 해둠)
                    visited[xx][yy] = true;
                }
                // 만약 물 개수가 현재 위치의 빙산 높이보다 작다면 아직 물로 변하지 않으므로
                else{
                    // 해당 좌표를 새로운 빙산 좌표를 저장할 Queue에 저장하고
                    bq.add(new Node(xx, yy));

                    // 새로운 높이로 갱신
                    map[xx][yy] = map[xx][yy] - water;
                }
            }

            // 모든 빙산의 좌표를 돌았으면 빙산에서 물로 변하는 부분을
            // 방문 여부 true로 바꿔놨으므로 visitied가 true인 부분을
            // 모두 0으로 모두 바꿔줌
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(visited[i][j]){
                        map[i][j] = 0;
                    }
                }
            }

            // 만약 새롭게 녹일 빙산의 좌표가 없다면
            if(bq.isEmpty()){
                // 두 덩어리 이상으로 나눠지지 않고 빙산이 모두 녹았다는 뜻이므로
                // 연도를 0으로 초기화하고 break
                year = 0;

                break;
            }

            // 그리고 새로운 빙산의 좌표들을 q에 저장
            q = bq;
        }
    }

    // 빙산의 덩어리 개수를 셀 BFS
    public static void count(int x, int y){
        Queue<Node> q = new LinkedList<>();

        // 해당 좌표를 Queue에 넣고
        q.add(new Node(x, y));

        // 방문 처리
        visited2[x][y] = true;

        while(!q.isEmpty()){
            Node node = q.poll();

            int xx = node.x;
            int yy = node.y;

            // 해당 좌표의 상하좌우를 탐색
            for(int i = 0; i < 4; i++){
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 범위를 초과하면 continue
                if(nx >= N || nx < 0 || ny >= M || ny < 0){
                    continue;
                }

                // 만약 상하좌우 이동한 좌표가 방문처리되어 있지 않고 빙산이라면
                if(!visited2[nx][ny] && (map[nx][ny] != 0)){
                    // 해당 좌표를 Queue에 저장하고
                    q.add(new Node(nx, ny));

                    // 방문처리
                    visited2[nx][ny] = true;
                }
            }
        }

        // while문이 끝났다면 해당 좌표와 연결된 빙산을 모두 카운트 했다는 뜻이므로 cnt + 1
        cnt = cnt + 1;
    }
}
