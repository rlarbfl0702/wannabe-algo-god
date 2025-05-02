import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int map[][];
    public static int cost[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        while(true){
            // 지도 크기
            N = Integer.parseInt(br.readLine());

            // 만약 0을 입력받으면 while문 종료
            if(N == 0){
                break;
            }

            // 몇번째 예시인지 카운트
            cnt = cnt + 1;

            map = new int[N][N];
            // 좌표값에 해당될 최소 루피의 합
            cost = new int[N][N];

            // 최소 루피 값을 저장할 배열의 초기값을 Integer 최대값으로 저장
            for(int i = 0; i < N; i++){
                Arrays.fill(cost[i], Integer.MAX_VALUE);
            }

            // 처음 좌표 값을 최소 루피 값을 저장할 배열의 해당 좌표 값에 저장
            cost[0][0] = map[0][0];

            // 최솟값을 저장할 변수
            result = Integer.MAX_VALUE;

            // 지도 입력받기
            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                for(int j = 0; j < N; j++){
                    int n = Integer.parseInt(st.nextToken());

                    map[i][j] = n;
                }
            }

            // 링크가 처음 있는 위치와 위치 값으로 BFS를 돌림
            BFS(0, 0, map[0][0]);

            sb.append("Problem " + cnt + ": " + result + "\n");
        }

        System.out.println(sb);
    }

    public static class Node{
        int x;
        int y;
        int sum;

        public Node(int x, int y, int sum){
            this.x = x;
            this.y = y;
            this.sum = sum;
        }
    }

    public static void BFS(int x, int y, int s){
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(x, y, s));

        while(!q.isEmpty()){
            Node node = q.poll();

            int xx = node.x;
            int yy = node.y;
            int ss = node.sum;

            // 만약 좌표값이 지도의 오른쪽 맨 끝이라면
            if((xx == (N - 1)) && (yy == (N - 1))){
                // 해당 좌표를 도착할 때까지 들었던 루피의 총 합이
                // 현재 결과값보다 적다면 현재 결과값을 갱신하고 continue
                if(ss <= result){
                    result = ss;
                }

                continue;
            }

            // 해당 좌표로 상하좌우 탐색
            for(int i = 0; i < 4; i++){
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 이동한 좌표가 지도의 크기를 넘어간다면 continue
                if(nx >= N || nx < 0 || ny >= N || ny < 0){
                    continue;
                }

                // 현재 좌표값의 루피 값에 이동한 좌표의 루피값을 더한 값이
                // 이동한 좌표의 최소 루피 값보다 작다면
                // 갱신해야되므로
                if(ss + map[nx][ny] < cost[nx][ny]){
                    // 이동한 좌표의 최소 루피 값을 두 값을 더한 값으로 갱신하고
                    cost[nx][ny] = ss + map[nx][ny];

                    // Queue에 추가
                    q.add(new Node(nx, ny, ss + map[nx][ny]));
                }
            }
        }
    }
}
