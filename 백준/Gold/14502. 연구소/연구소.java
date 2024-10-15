import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] graph;
    static boolean[][] visited;
    static Deque<int[]> queue = new ArrayDeque<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer = 0;
    static int cnt = 0;
    static int walls = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if(graph[i][j] == 1) {
                    walls++;
                }
            }
        }

        dfs(0, 0, 0);
        System.out.println(answer);

    }
    static void dfs(int depth, int x, int y) {
        if(depth == 3) {
            check();
            cnt = 0;
            return;
        }

        for(int i=x; i<N; i++) {
            for(int j=(i == x ? y : 0); j<M; j++) {
                if(graph[i][j] == 0) {
                    graph[i][j] = 1;
                    dfs(depth+1, i, j+1);
                    graph[i][j] = 0;
                }
            }
        }
    }
    static void check() {
        visited = new boolean[N][M];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(graph[i][j] == 2 && !visited[i][j]) {
                    queue.addLast(new int[]{i, j});
                    visited[i][j] = true;
                    cnt++;
                    count();
                }
            }
        }
        answer = Math.max(answer, N*M-3-walls-cnt);
    }
    static void count() {
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=M) {
                    continue;
                }
                if(!visited[nx][ny] && graph[nx][ny] != 1) {
                    visited[nx][ny] = true;
                    cnt++;
                    queue.addLast(new int[]{nx, ny});
                }
            }
        }
    }
}