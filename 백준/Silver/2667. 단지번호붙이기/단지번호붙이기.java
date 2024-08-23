import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] graph;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());

        graph = new char[N][N];

        for(int i=0; i<N; i++) {
            graph[i] = br.readLine().toCharArray();
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(graph[i][j] == '1') {
                    bfs(i, j);
                }
            }
        }

        Collections.sort(list);
        sb.append(list.size()).append('\n');
        for(int l: list) {
            sb.append(l).append('\n');
        }
        System.out.println(sb);
    }
    static void bfs(int sx, int sy) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.addLast(new int[]{sx, sy});
        graph[sx][sy] = '0';
        int cnt = 1;
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=N) {
                    continue;
                }
                if(graph[nx][ny] == '1') {
                    graph[nx][ny] = '0';
                    cnt++;
                    queue.addLast(new int[]{nx, ny});
                }
            }
        }
        list.add(cnt);
    }
}