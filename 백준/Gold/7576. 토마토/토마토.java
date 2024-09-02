import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        boolean alreadyFinished = true;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if(graph[i][j] == 1) {
                    queue.addLast(new int[]{i, j, 0});
                }
                if(graph[i][j] == 0) {
                    alreadyFinished = false;
                }
            }
        }
        if(alreadyFinished) {
            System.out.println(0);
            return;
        }
        int answer = bfs();
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if (graph[i][j] == 0) {
                    answer = -1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    static int bfs() {
        int day = -1;
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            int d = tmp[2];
            day = d;
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=M) {
                    continue;
                }
                if(graph[nx][ny] == 0) {
                    graph[nx][ny] = 1;
                    queue.addLast(new int[]{nx, ny, d+1});
                }
            }
        }
        return day;
    }
}