import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, V;
    static Deque<Integer> queue = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken())-1;

        graph = new boolean[N][N];
        visited = new boolean[N];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken())-1;
            int n2 = Integer.parseInt(st.nextToken())-1;
            graph[n1][n2] = true;
            graph[n2][n1] = true;
        }
        dfs(V);
        sb.append('\n');
        visited = new boolean[N];
        bfs();

        System.out.println(sb);
    }
    static void dfs(int node) {
        visited[node] = true;
        sb.append(node+1).append(' ');
        for(int i=0; i<N; i++) {
            if(graph[node][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
    static void bfs() {
        queue.addLast(V);
        visited[V] = true;
        sb.append(V+1).append(' ');
        while(!queue.isEmpty()) {
            int node = queue.removeFirst();
            for(int i=0; i<N; i++) {
                if(graph[node][i] && !visited[i]) {
                    visited[i] = true;
                    sb.append(i+1).append(' ');
                    queue.addLast(i);
                }
            }
        }
    }
}