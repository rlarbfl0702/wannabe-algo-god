import java.io.*;
import java.util.*;

public class Main {

    // Node 클래스 정의
    public static class Node{
        int node;
        int len;

        public Node(int node, int len){
            this.node = node;
            this.len = len;
        }
    }

    public static int V;
    public static ArrayList<Node> tree[];
    public static int far_v;
    public static int max_len;
    public static boolean visited[];
    public static int result;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정점의 갯수
        V = Integer.parseInt(br.readLine());

        // 인접 리스트로 tree 구현
        tree = new ArrayList[V + 1];

        // 최대 길이를 저장할 변수
        max_len = Integer.MIN_VALUE;

        // 방문 처리
        visited = new boolean[V + 1];

        // 결과값을 저장할 변수
        result = Integer.MIN_VALUE;

        // 배열을 ArrayList로 초기화
        for(int i = 0; i <= V; i++){
            tree[i] = new ArrayList<>();
        }

        for(int i = 0; i < V; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 기준 정점 정보
            int s = Integer.parseInt(st.nextToken());

            // 연결 노드를 저장할 변수
            int fin = 0;
            // 연결된 노드간의 길이를 저장할 변수
            int l = 0;

            while(true){

                // 연결 노드 정보
                fin = Integer.parseInt(st.nextToken());

                // 만약 들어온 값이 -1이라면 입력 종료이므로 break
                if(fin == -1){
                    break;
                }

                // 해당 연결 노드의 길이
                l = Integer.parseInt(st.nextToken());

                // 각 노드를 연결하고 길이를 저장
                tree[s].add(new Node(fin, l));
                tree[fin].add(new Node(s, l));
            }
        }

        // 임의 노드를 기준으로 제일 먼 노드에서 제일 먼 노드를 찾아서
        // 계산한 길이로 최대 길이 갱신
        // 노드 1에서 제일 먼 노드를 저장할 변수를 초기화
        far_v = 0;

        // 노드 i에서 가장 먼 노드를 찾기
        DFS(0, 1);

        // 방문 여부 초기화
        Arrays.fill(visited, false);

        // 최대 길이 초기화
        max_len = 0;

        // 노드 1에서 가장 먼 노드로 다시 DFS를 돌려서
        // 해당 노드에서 가장 먼 노드를 찾고 거리를 찾음
        DFS(0, far_v);

        System.out.println(max_len);
    }

    public static void DFS(int d, int n1){
        // 현재 노드를 방문 처리
        visited[n1] = true;

        // 만약 현재 길이가 최대 길이보다 길다면
        if(d > max_len){
            // 최대 길이를 갱신하고
            max_len = d;
            // 제일 먼 노드를 현재 노드로 변경
            far_v = n1;
        }

        // 현재 노드에 연결된 노드들 중
        for(Node n : tree[n1]){
            // 방문하지 않은 노드가 있다면
            if(!visited[n.node]){
                // 해당 노드와의 거리를 총 거리에 더하고
                // 해당 노드로 DFS를 돌림
                DFS(d + n.len, n.node);
            }
        }
    }
}
