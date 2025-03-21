import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static Character map[][];
    public static int visitied[][];
    public static int copy_v[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int result = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new Character[N][M];
        visitied  = new int[N][M];

        result = 0;

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            for(int j = 0; j < M; j++){
                char c = s.charAt(j);

                map[i][j] = c;

                // 바다일 경우, 방문할 수 없도록 처리
                if(c == 'W'){
                    visitied[i][j] = -1;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){

                copy_v = new int[N][M];

                for (int k = 0; k < N; k++) {
                    copy_v[k] = visitied[k].clone();
                }

                if((map[i][j] == 'L')){
                    BFS(i, j);
                }
            }
        }

        System.out.println(result - 1);

    }

    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void BFS(int sx, int sy){
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(sx, sy));

        copy_v[sx][sy] = 1;

        int sum = 0;

        while(!q.isEmpty()){
            Node n = q.poll();

            int x = n.x;
            int y = n.y;

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= N || nx < 0 || ny >= M || ny < 0){
                    continue;
                }

                // 땅이고 해당 땅을 방문하지 않았을 때
                if((map[nx][ny] == 'L') && copy_v[nx][ny] == 0){
                    copy_v[nx][ny] = copy_v[x][y] + 1;

                    sum = Math.max(sum, copy_v[nx][ny]);

                    q.add(new Node(nx, ny));
                }
            }
        }

        result = Math.max(result, sum);
    }
}
