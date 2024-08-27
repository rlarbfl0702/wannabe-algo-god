import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static boolean road[][];
    static int result[][];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 정점의 개수
        N = Integer.parseInt(br.readLine());
        // 연결 정보를 저장할 2차원 배열
        road = new boolean[N][N];
        // 결과값을 저장할 2차원 배열
        result = new int[N][N];

        // 연결 여부를 저장
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++){
                int n = Integer.parseInt(st.nextToken());

                // 값이 1이라면 i노드에서 j노드까지 길이 있으므로
                // true로 변경
                if(n == 1){
                    road[i][j] = true;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                BFS(i, j);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(result[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void BFS(int start, int end){
        Queue<Integer> q = new LinkedList<>();

        // 시작점을 Queue에 넣어줌
        q.offer(start);

        // 도착지점에 갈 수 있는지 판단 여부
        boolean find = false;
        // 해당 노드를 방문했는지 저장 배열
        boolean visited[] = new boolean[N];
        int cnt = 0;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int s = q.poll();

            // 만약 Queue에서 뺀 값이
            // 도착지점 노드와 같다면
            // 해당 배열의 값을 1로 저장하고
            // while문을 처음 도는게 아니라면 (배열의 (i, i)같은 경우 for문 돌기도 전에 나가므로)
            if((s == end) && (cnt != 0)){
                result[start][end] = 1;
                // 도착할 수 있다고 true로 바꿔줌
                find = true;
                break;
            }

            for(int i = 0; i < N; i++){
                // 만약 시작지점에서 i번째 노드까지 갈 수 있다면
                if(road[s][i]){
                    // i번째 노드를 방문하지 않았을 경우
                    if(!visited[i]){
                        // Queue에 i를 넣고
                        q.offer(i);
                        // 해당 노드를 방문처리함
                        visited[i] = true;
                    }
                }
            }

            cnt = cnt + 1;
        }

        // 만약 while문을 돌았는데도
        // 도착지점에 도달하지 못했다면
        if(!find){
            // 해당 배열의 값을 0으로 저장
            result[start][end] = 0;
        }
    }
}
