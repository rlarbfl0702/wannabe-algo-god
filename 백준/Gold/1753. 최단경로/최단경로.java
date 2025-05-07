import java.io.*;
import java.util.*;

public class Main {

    public static int V;
    public static int E;
    public static int K;
    public static List<Node> map[];
    public static int result[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점 개수
        V = Integer.parseInt(st.nextToken());
        // 간선 개수
        E = Integer.parseInt(st.nextToken());

        K = Integer.parseInt(br.readLine());


        //간선 정보 저장할 ArrayList
        map = new ArrayList[V + 1];

        for(int i = 1; i <= V; i++){
            map[i] = new ArrayList<>();
        }

        // 각 정점에 도착할 때 걸리는 최단 경로를 저장할 배열
        result = new int[V + 1];

        // 간선 정보 저장
        for(int i = 0; i < E; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());
            int w = Integer.parseInt(st2.nextToken());

            map[u].add(new Node(v, w));
        }

        // 결과값을 저장할 배열에 Integer 최대값으로 저장
        Arrays.fill(result, Integer.MAX_VALUE);

        BFS(K);

        for(int i = 1; i <= V; i++){
            // 만약 정점의 결과값이 Integer 최대값이라면
            // 방문할 수 없다는 뜻이므로
            if(result[i] == Integer.MAX_VALUE){
                // INF를 출력
                System.out.println("INF");
            }
            // 아니라면 결과값을 출력
            else{
                System.out.println(result[i]);
            }
        }
    }

    public static class Node implements Comparable<Node>{
        int x;
        int d;

        public Node(int x, int d){
            this.x = x;
            this.d = d;
        }

        public int compareTo(Node o){
            return this.d - o.d;
        }
    }

    public static void BFS(int s){
        PriorityQueue<Node> q = new PriorityQueue<>();

        // 첫 시작점과 거리 0을 Queue에 추가
        q.add(new Node(s, 0));

        // 해당 시작점에서 시작점까지 간 길이를 0으로 저장
        result[s] = 0;

        while(!q.isEmpty()){
            Node node = q.poll();

            int xx = node.x;
            int dd = node.d;

            // 연결된 모든 정점을 돌며
            for(Node n : map[xx]){
                // 해당 경로를 방문했을 떄의 길이가 현재 정점을 가는데 필요한 경로보다 짧다면
                if(result[n.x] > dd + n.d){
                    // 결과값을 갱신하고
                    result[n.x] = dd + n.d;

                    // 해당 정점과 현재 거리에 해당 간선의 길이를 Queue에 넣음
                    q.add(new Node(n.x, dd + n.d));
                }
            }
        }
    }
}
