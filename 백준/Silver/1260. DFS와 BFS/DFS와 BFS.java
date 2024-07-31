import java.io.*;
import java.util.*;

public class Main {

    static TreeSet<Integer>[] arr;

    static ArrayList<Integer> d_result;

    static ArrayList<Integer> b_result;

    static boolean visited[];

    static int N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 개수
        N = Integer.parseInt(st.nextToken());

        // 간선의 개수
        int M = Integer.parseInt(st.nextToken());

        // 시작할 정점의 번호
        int V = Integer.parseInt(st.nextToken());

        // 연결 정보를 저장할 ArrayList 배열
        arr = new TreeSet[N + 1];

        // dfs 결과값 저장할 ArrayList
        d_result = new ArrayList<>();

        // bfs 결과값 저장할 ArrayList
        b_result = new ArrayList<>();

        // 노드의 방문여부를 저장할 배열
        visited = new boolean[N + 1];

        for(int i = 1; i <= N; i++){
            // 배열 원소를 TreeSet으로 초기화
            arr[i] = new TreeSet<Integer>();
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st2.nextToken());
            int n2 = Integer.parseInt(st2.nextToken());

            // 각 노드에 연결된 노드 추가
            arr[n1].add(n2);
            arr[n2].add(n1);
        }

        // DFS의 결과값을 저장할 ArrayList에 초기 노드값을 저장
        d_result.add(V);

        // 초기 노드의 방문값을 true로 변환
        visited[V] = true;

        // DFS를 돌림
        DFS(V);

        // BFs를 돌리기전 방문여부를 초기화
        visited = new boolean[N + 1];

        // BFS를 돌림
        BFS(V);

        // DFS 결과값 출력
        for(int i = 0; i < d_result.size(); i++){
            sb.append(d_result.get(i) + " ");
        }

        sb.append("\n");

        // BFS 결과값 출력
        for(int i = 0; i < b_result.size(); i++){
            sb.append(b_result.get(i) + " ");
        }

        System.out.println(sb);
    }

    static public void DFS(int a){
        // 만약 DFS의 결과값 ArrayList의 크기가 노드 크기와 같다면
        if(d_result.size() == N){
            return;
        }

        // 기존 노드에 연결되어 있는 노드중
        for(int i : arr[a]){
            // 만약 해당 노드를 방문하지 않았다면
            if(!visited[i]){
                // 해당 노드의 결과값을 true로 바꾸고
                visited[i] = true;

                // 그리고 DFS 결과값 ArrayList에 해당 노드를 넣음
                d_result.add(i);

                // 해당 노드를 기준으로 다시 DFS를 돌림
                DFS(i);
            }
        }
    }

    static public void BFS(int a){
        Queue<Integer> q = new LinkedList<>();

        // 초기 노드값을 Queue에 넣고
        q.offer(a);

        // bfs 결과값 ArrayList에 해당 노드값 저장
        b_result.add(a);

        // 그리고 해당 노드를 방문처리
        visited[a] = true;

        while(!q.isEmpty()){
            int node = q.poll();

            // 해당 노드에 있는 값들 중
            for(int i: arr[node]){
                // 방문하지 않은 노드가 있다면
                if(!visited[i]){
                    // 해당 노드 번호를 Queue에 넣어주고
                    q.offer(i);

                    // 방문처리를 해줌
                    visited[i] = true;

                    // 그리고 bfs 결과값 ArrayList에 해당 노드 저장
                    b_result.add(i);
                }
            }
        }
    }
}
