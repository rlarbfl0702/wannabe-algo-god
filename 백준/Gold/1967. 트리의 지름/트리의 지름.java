import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static ArrayList<Node>[] tree;
    public static int max_d;
    public static int far;
    public static boolean visited[];
    public static int result;

    // Node 클래스 정의
    static class Node {
        int node;
        int weight;

        // 자식 노드와 길이를 저장할 변수
        public Node(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 노드 갯수
        N = Integer.parseInt(br.readLine());

        if (N == 1) {
            // 노드가 하나뿐이라면 트리의 지름은 0
            System.out.println(0);
            return;
        }

        // ArrayList로 트리 구현
        tree = new ArrayList[N + 1];

        // 노드의 방문 처리
        visited = new boolean[N + 1];

        // 결과값을 저장할 변수
        result = Integer.MIN_VALUE;

        // 최대 길이를 구할 변수
        max_d = 0;

        // 제일 먼 노드를 저장할 변수
        far = 0;

        // 초기화
        for(int i = 1; i <= N; i++){
            tree[i] = new ArrayList<>();
        }

        for(int i = 0; i < N - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 부모 노드
            int p = Integer.parseInt(st.nextToken());
            // 자식 노드
            int c = Integer.parseInt(st.nextToken());
            // 길이
            int l = Integer.parseInt(st.nextToken());

            // 부모 노드와 자식 노드 간 서로 연결하고 길이 저장
            tree[p].add(new Node(c, l));
            tree[c].add(new Node(p, l));
        }

        // 노드 1에서 가장 먼 노드 찾기
        DFS(1, 0);

        // 방문 여부 초기화
        Arrays.fill(visited, false);

        // 최대 거리를 초기화
        max_d = 0;

        // 노드 1에서 가장 먼 노드로 다시 DFS를 돌려서 
        // 해당 노드에서 가장 먼 노드를 찾고 거리를 찾음
        DFS(far, 0);

        System.out.println(max_d);
    }

    public static void DFS(int current, int d){
        // 현재 노드를 방문 처리
        visited[current] = true;

        // 만약 현재 길이가 최대 길이보다 길다면
        if(d > max_d){
            // 최대 길이를 갱신하고
            max_d = d;
            // 제일 먼 노드를 현재 노드로 변경
            far = current;
        }

        // 현재 노드에 연결된 노드들 중
        for(Node n : tree[current]){
            // 방문하지 않은 노드가 있다면
            if(!visited[n.node]){
                // 해당 노드와의 거리를 총 거리에 더하고
                // 해당 노드로 DFS를 돌림
                DFS(n.node, d + n.weight);
            }
        }
    }
}
