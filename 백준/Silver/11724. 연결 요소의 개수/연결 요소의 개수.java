import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static boolean visited[];
    static ArrayList<Integer> graph[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 개수
        N = Integer.parseInt(st.nextToken());
        // 간선의 개수
        M = Integer.parseInt(st.nextToken());

        // 노드의 방문여부
        visited = new boolean[N + 1];

        // 연결된 정점을 저장할 ArrayList
        graph = new ArrayList[N + 1];

        for(int i = 0; i <= N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            // 기준 노드
            int a = Integer.parseInt(st2.nextToken());
            // 연결 노드
            int b = Integer.parseInt(st2.nextToken());

            // 서로 노드에 연결
            graph[a].add(b);
            graph[b].add(a);
        }

        // 연결 개수를 셀 변수
        int cnt = 0;

        // 노드 번호대로 돌다가
        for(int i = 1; i <= N; i++){
            // 방문하지 않은 노드가 있다면
            if(!visited[i]){
                // BFS를 돌리고
                BFS(i);

                // 연결 개수 + 1
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }

    public static void BFS(int n){
        // 노드를 저장할 Queue
        LinkedList<Integer> q = new LinkedList<>();

        // Queue에 입력받은 값을 넣음
        q.offer(n);

        // 해당 노드 방문 처리
        visited[n] = true;

        while(!q.isEmpty()){
            // 맨 위의 끝 값을 따로 저장
            int node = q.peek();

            q.poll();

            // 노드랑 연결된 노드 수만큼 반복
            for(int i : graph[node]){
                // 해당 노드를 방문하지 않았다면
                if(!visited[i]){
                    // Queue에 해당 노드를 추가하고
                    q.add(i);

                    // 방문 처리
                    visited[i] = true;
                }
            }
        }
    }
}
