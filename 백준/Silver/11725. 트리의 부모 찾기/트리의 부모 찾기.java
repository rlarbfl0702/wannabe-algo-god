import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer> tree[];
    static int parent[];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 입력 받기
        N = Integer.parseInt(br.readLine());
        // 인접 리스트로 트리 구현
        tree = new ArrayList[N + 1];
        // 각 노드의 부모를 저장할 배열
        parent = new int[N + 1];
        // 방문 처리
        visited = new boolean[N + 1];

        // 인접 리스트 초기화
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        // 트리의 간선 정보 입력받기
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 양방향으로 연결
            tree[a].add(b);
            tree[b].add(a);
        }

        // DFS를 통해 부모 정보 찾기 (루트 노드를 1부터 시작한다 했으므로)
        dfs(1);

        // 2번 노드부터 N번 노드까지의 부모 출력
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append("\n");
        }

        System.out.print(sb);
    }

    // 부모 노드 찾기 위한 DFS
    public static void dfs(int node) {
        // 현재 노드 방문 처리
        visited[node] = true;

        // 현재 노드와 연결된 자식 노드들 확인
        for (int child : tree[node]) {
            // 방문하지 않은 노드라면
            if (!visited[child]) {
                // 현재 노드를 해당 노드의 부모로 저장 후
                parent[child] = node;
                // 자식 노드로 다시 DFS를 돌림
                dfs(child);
            }
        }
    }
}