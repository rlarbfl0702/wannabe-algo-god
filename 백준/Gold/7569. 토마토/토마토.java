import java.io.*;
import java.util.*;

public class Main {
    static int M, N, H;
    static int[][][] graph;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static Deque<int[]> queue = new ArrayDeque<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        graph = new int[H][N][M];

        boolean alreadyFinished = true;
        for(int k=0; k<H; k++) {
            for(int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<M; j++) {
                    graph[k][i][j] = Integer.parseInt(st.nextToken());
                    if(graph[k][i][j] == 1) {
                        queue.addLast(new int[]{k, i, j, 0});
                    }
                    if(graph[k][i][j] == 0) {
                        alreadyFinished = false;
                    }
                }
            }
        }

        if(alreadyFinished) {
            System.out.println(0);
            return;
        }

        int answer = bfs();

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (graph[k][i][j] == 0) {
                        answer = -1;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    static int bfs() {
        int day = 0;
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int z = tmp[0];
            int x = tmp[1];
            int y = tmp[2];
            day = tmp[3];
            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nz < 0 || nx < 0 || ny < 0 || nz >= H || nx >= N || ny >= M) {
                    continue;
                }
                if (graph[nz][nx][ny] == 0) {
                    graph[nz][nx][ny] = 1;
                    queue.addLast(new int[]{nz, nx, ny, day + 1});
                }
            }
        }
        return day;
    }
}