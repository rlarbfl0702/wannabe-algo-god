import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] graph;
    static int[][] cnt;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new char[N][M];
        cnt = new int[N][M];

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                graph[i][j] = str.charAt(j);
            }
        }
        bfs();
        System.out.println(cnt[N-1][M-1] + 1);
    }
    static void bfs() {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.addLast(new int[]{0, 0});
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
                if(graph[nx][ny] == '1') {
                    graph[nx][ny] = '0';
                    cnt[nx][ny] = cnt[x][y] + 1;
                    queue.addLast(new int[]{nx, ny});
                }
            }
        }
    }
}