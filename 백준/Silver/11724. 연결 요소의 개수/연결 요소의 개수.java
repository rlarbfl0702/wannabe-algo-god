import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new boolean[N][N];
        visited = new boolean[N];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken())-1;
            int n2 = Integer.parseInt(st.nextToken())-1;
            graph[n1][n2] = true;
            graph[n2][n1] = true;
        }

        int answer = 0;
        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
    static void dfs(int node) {
        visited[node] = true;
        for(int i=0; i<N; i++) {
            if(graph[node][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
}