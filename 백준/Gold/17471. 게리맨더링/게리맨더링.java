import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] node;
    static boolean[][] graph;
    static int[] sector1;
    static int[] sector2;
    static boolean[] visited;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        node = new int[N];
        graph = new boolean[N][N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            node[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            for(int c=0; c<cnt; c++) {
                int num = Integer.parseInt(st.nextToken())-1;
                graph[i][num] = true;
                graph[num][i] = true;
            }
        }

        for(int i=1; i<N/2+1; i++) {
            visited = new boolean[N];
            sector1 = new int[i];
            sector2 = new int[N-i];
            dfs(0, i);
        }

        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
    }

    static void dfs(int depth, int size) {
        if(depth == size) {
            int cnt = 0;
            for(int i=0; i<N; i++) {
                if(!visited[i]) {
                    sector2[cnt++] = i;
                }
            }
            if(check(sector1) && check(sector2)) {
                // 값 계산
                int tmp = 0;
                for(int s: sector1) {
                    tmp += node[s];
                }
                for(int s: sector2) {
                    tmp -= node[s];
                }
                answer = Math.min(answer, Math.abs(tmp));
            }
            return;
        }
        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                sector1[depth] = i;
                dfs(depth + 1, size);
                visited[i] = false;
            }
        }
    }

    static boolean check(int[] sector) {
        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] v = new boolean[N];

        queue.addLast(sector[0]);
        v[sector[0]] = true;
        int cnt = 1;

        while(!queue.isEmpty()) {
            int node = queue.removeFirst();
            for(int i=0; i<sector.length; i++) {
                if(graph[node][sector[i]] && !v[sector[i]]) {
                    v[sector[i]] = true;
                    queue.addLast(sector[i]);
                    cnt++;
                }
            }
        }
        return cnt == sector.length;
    }
}