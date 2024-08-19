import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[][] graph;
    static boolean[] visited;
    static int total;
    static Deque<int[]> queue = new ArrayDeque<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new boolean[N][N];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken()) - 1;
            int n2 = Integer.parseInt(st.nextToken()) - 1;
            graph[n1][n2] = true;
            graph[n2][n1] = true;
        }
        int answer = 0;
        int tmp = Integer.MAX_VALUE;
        for(int i=N-1; i>=0; i--) {
            visited = new boolean[N];
            total = 0;
            bfs(i);
            if(total <= tmp) {
                tmp = total;
                answer = i+1;
            }
        }
        System.out.println(answer);
    }
    static void bfs(int n) {
        visited[n] = true;
        queue.addLast(new int[]{n, 1});
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int node = tmp[0];
            int cnt = tmp[1];
            for(int i=0; i<N; i++) {
                if(!visited[i] && graph[node][i]) {
                    visited[i] = true;
                    total += cnt;
                    queue.addLast(new int[]{i, cnt+1});
                }
            }
        }
    }
}