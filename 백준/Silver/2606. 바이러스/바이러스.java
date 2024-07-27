import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N][N];
        visited = new boolean[N];

        int n1 = 0;
        int n2 = 0;
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken()) - 1;
            n2 = Integer.parseInt(st.nextToken()) - 1;
            graph[n1][n2] = true;
            graph[n2][n1] = true;
        }

        dfs(0);
        System.out.println(answer - 1);
    }

    static void dfs(int node) {
        answer++;
        visited[node] = true;
        for(int i=0; i<N; i++) {
            if(graph[node][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
}