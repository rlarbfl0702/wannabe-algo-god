import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        graph = new char[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++) {
            graph[i] = br.readLine().toCharArray();
        }
        int cnt = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j]) {
                    visited[i][j] = true;
                    queue.addLast(new int[]{i, j});
                    bfs();
                    cnt++;
                }
            }
        }

        int cnt2 = 0;
        visited = new boolean[N][N];
        queue = new ArrayDeque<>();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j]) {
                    visited[i][j] = true;
                    queue.addLast(new int[]{i, j});
                    bfs2();
                    cnt2++;
                }
            }
        }
        sb.append(cnt).append(' ').append(cnt2).append('\n');
        System.out.println(sb);
    }
    static void bfs() {
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=N) {
                    continue;
                }
                if(graph[nx][ny] == graph[x][y] && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.addLast(new int[]{nx, ny});
                }
            }
        }
    }
    static void bfs2() {
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=N) {
                    continue;
                }
                if(graph[x][y] == 'R' || graph[x][y] == 'G') {
                    if((graph[nx][ny] == 'G' || graph[nx][ny] == 'R') && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.addLast(new int[]{nx, ny});
                    }
                }
                else {
                    if(graph[nx][ny] == graph[x][y] && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.addLast(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}