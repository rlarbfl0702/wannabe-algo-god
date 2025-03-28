import java.io.*;
import java.util.*;

public class Main {

    public static int parent[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 부모 노드를 저장할 배열
        parent = new int[N + 1];

        // 해당 노드의 부모 노드를 자기자신으로 처음 저장
        for(int i = 0; i <= N; i++){
            parent[i] = i;
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int io = Integer.parseInt(st2.nextToken());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            if(io == 0){
                union(a, b);
            }
            // a와 b가 같은 집합인지 확인해야 될 경우,
            else if(io == 1){
                // a의 부모와 b의 부모가 같은지 확인하여
                // 같을 경우, YES를 출력하고
                // 다를 경우, NO를 출력
                if(find(a) == find(b)){
                    sb.append("YES" + "\n");
                }
                else{
                    sb.append("NO" + "\n");
                }
            }
        }

        System.out.println(sb);
    }

    // 부모 찾는 함수
    public static int find(int x){
        // x의 부모가 x일 경우, x의 부모는 x이므로 x를 반환
        if(parent[x] == x){
            return x;
        }

        // 아닐 경우, x의 부모의 부모를 찾기 위해 재귀적으로
        // x의 부모로 find 함수를 사용
        // 그리고 찾은 x의 부모의 부모를 x의 부모로 저장 후, 반환
        return parent[x] = find(parent[x]);
    }

    // 두 집합을 합치는 함수
    public static void union(int a, int b){
        // a의 부모를 찾아서 저장
        int root_a = find(a);

        // b의 부모를 찾아서 저장
        int root_b = find(b);

        // 만약 a의 부모와 b의 부모가 같지 않다면
        if(root_a != root_b){
            // b의 부모의 부모를 a의 부모로 바꿈
            parent[root_b] = root_a;
        }
    }
}
