import java.util.*;
import java.io.*;

public class Main {

    public static int N;
    public static ArrayList<Integer> tree[];

    public static int result;
    public static int parent[];
    public static int child[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 노드 갯수
        N = Integer.parseInt(br.readLine());
        // 트리
        tree = new ArrayList[N];

        // 해당 노드의 부모를 저장할 배열
        parent = new int[N];

        // 자식이 몇개 있는지 저장할 배열
        child = new int[N];

        // 각 배열마다 ArrayList로 초기화
        for(int i = 0; i < N; i++){
            tree[i] = new ArrayList<>();
        }

        // 결과값을 저장할 변수
        result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            // 해당 노드의 부모
            int n = Integer.parseInt(st.nextToken());

            // 부모 노드가 없는게 아니라면
            if(n != -1){
                // 부모 노드에 자식 노드를 추가
                tree[n].add(i);

                // 해당 부모 노드에 자식 갯수를 + 1
                child[n] = child[n] + 1;
            }

            // 해당 노드의 부모를 저장
            parent[i] = n;
        }

        // 제거할 노드
        int remove = Integer.parseInt(br.readLine());

        DFS(remove);

        // 자식 갯수가 0인 노드의 갯수를 세고 출력
        for(int i = 0; i < N; i++){
            if(child[i] == 0){
                result = result + 1;
            }
        }

        System.out.println(result);
    }

    public static void DFS(int node){
        // 해당 노드에 자식 노드가 없다면
        if(child[node] == 0){
            // 해당 노드의 부모의 자식 갯수를 1 빼고 return
            if(parent[node] != -1){
                child[parent[node]] = child[parent[node]] - 1;

                // 해당 노드의 자식 갯수를 Integer 최댓값으로 저장
                // (해당 노드는 없어지므로)
                child[node] = Integer.MAX_VALUE;
            }
            // 만약 해당 노드의 부모가 없다면
            // 해당 노드는 루트 노드이므로
            // 모든 노드를 제거하여 남은 노드가 없으므로
            // 자식을 저장할 배열에 모두 Integer의 최솟값을 저장하고 return
            else{
                Arrays.fill(child, Integer.MAX_VALUE);
            }
        }
        // 해당 노드에 자식 노드가 있다면
        else{
            // 해당 노드의 부모의 자식 갯수를 1 빼고
            if(parent[node] != -1){
                child[parent[node]] = child[parent[node]] - 1;
            }
            // 부모 노드가 없다면 모두 Integer 최댓값으로 초기화
            else{
                Arrays.fill(child, Integer.MAX_VALUE);
            }

            // 해당 노드의 자식 갯수를 Integer 최댓값으로 저장
            // (해당 노드는 없어지므로)
            child[node] = Integer.MAX_VALUE;

            // 해당 노드와 연결된 자식 노드에도
            // 자식이 있는지 보고 DFS를 다시 돌림
            for(int n : tree[node]){
                // 그 자식 노드에도 자식 노드가 있다면
                if(child[n] != 0){
                    // 해당 노드로 DFS를 돌림
                    DFS(n);
                }
                // 없다면 해당 노드를 제거
                else{
                    child[n] = Integer.MAX_VALUE;
                }
            }
        }
    }
}
