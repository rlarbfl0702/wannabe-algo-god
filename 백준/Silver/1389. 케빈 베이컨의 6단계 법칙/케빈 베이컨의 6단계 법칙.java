import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static ArrayList<Integer> friends[];
    static boolean visited[];

    static int result;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 유저의 수
        N = Integer.parseInt(st.nextToken());
        // 친구 관계의 수
        M = Integer.parseInt(st.nextToken());

        // 친구 관계 연결
        friends = new ArrayList[N + 1];
        // 노드 방문 여부
        visited = new boolean[N + 1];
        // 각 노드 연결 횟수 총 더할 변수
        result = 0;

        // 해당 배열을 ArrayList로 초기화
        for(int i = 0; i <= N; i++){
            friends[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            // 노드
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            // 서로의 노드에 노드를 연결
            friends[a].add(b);
            friends[b].add(a);
        }

        // 최솟값을 계산할 변수
        int min = Integer.MAX_VALUE;
        // 정답 유저
        int user = 0;

        // 기준 노드가 자기 노드말고 다른 노드를 방문할때마다
        // BFS를 돌려서 횟수를 카운트
        for(int i = 1; i <= N; i++){
            // 방문 여부 초기화
            visited = new boolean[N + 1];
            // 각 노드마다 BFS를 돌림
            BFS(i);

            // min보다 결과값이 더 작으면 min 갱신
            if(min > result){
                min = result;

                user = i;
            }

            // BFS 돌린 결과값 초기화
            result = 0;
        }

        System.out.println(user);
    }

    public static void BFS(int x){
        Queue<Integer> q = new LinkedList<>();

        // 거리를 저장할 배열
        int distance[] = new int[N + 1];

        q.offer(x);

        // 방문 처리
        visited[x] = true;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int u = q.poll();

            // 기준 유저와 연결되어있는 유저들을 기준으로
            for(int i : friends[u]){
                if(!visited[i]){
                    // 만약 해당 유저를 아직 방문하지 않았다면
                    // 방문 처리 후, 기준 유저의 거리 + 1만큼 배열에 저장
                    visited[i] = true;
                    distance[i] = distance[u] + 1;

                    // 그리고 모든 유저의 거리를 저장하는 배열에 해당 유저 거리를
                    // 저장하고 Queue에 넣음
                    result = result + distance[i];
                    q.offer(i);
                }
            }
        }
    }
}
