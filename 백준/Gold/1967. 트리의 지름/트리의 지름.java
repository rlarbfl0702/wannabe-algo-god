import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static ArrayList<Node>[] tree;
    public static boolean[] visited;
    public static int maxDistance = 0;
    public static int farthestNode = 0;

    static class Node {
        int node;
        int weight;

        public Node(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 노드 개수
        N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(0);
            return; // 노드가 하나뿐이라면 트리의 지름은 0
        }

        tree = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        // 초기화
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            tree[parent].add(new Node(child, weight));
            tree[child].add(new Node(parent, weight));
        }

        // 1차 DFS: 임의의 노드(1번)에서 가장 먼 노드 찾기
        dfs(1, 0);

        // 방문 배열 초기화
        Arrays.fill(visited, false);
        maxDistance = 0;

        // 2차 DFS: 가장 먼 노드에서 시작해 트리의 지름 계산
        dfs(farthestNode, 0);

        System.out.println(maxDistance);
    }

    public static void dfs(int current, int distance) {
        visited[current] = true;

        if (distance > maxDistance) {
            maxDistance = distance;
            farthestNode = current;
        }

        for (Node neighbor : tree[current]) {
            if (!visited[neighbor.node]) {
                dfs(neighbor.node, distance + neighbor.weight);
            }
        }
    }
}
