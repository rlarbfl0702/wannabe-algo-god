import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] graph;
    static boolean[][] visited;
    static Deque<int[]> queue = new ArrayDeque<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];

        int minHeight = 100;
        int maxHeight = 0;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                minHeight = Math.min(minHeight, graph[i][j]);
                maxHeight = Math.max(maxHeight, graph[i][j]);
            }
        }

        int answer = 0;
        int cnt = 0;
        for(int h=minHeight; h<maxHeight; h++) {
            visited = new boolean[N][N];
            cnt = 0;
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(!visited[i][j] && graph[i][j] > h) {
                        visited[i][j] = true;
                        queue.addLast(new int[]{i, j});
                        bfs(h);
                        cnt++;
                    }
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer == 0 ? 1 : answer);
    }
    static void bfs(int height) {
        while (!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=N) {
                    continue;
                }
                if(!visited[nx][ny] && graph[nx][ny] > height) {
                    visited[nx][ny] = true;
                    queue.addLast(new int[]{nx, ny});
                }
            }
        }
    }
}