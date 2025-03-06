    import java.io.*;
    import java.util.*;

    public class Main{

        public static int N;
        public static boolean visited[][];
        public static int map[][];
        public static int dx[] = {-1, 1, 0, 0};
        public static int dy[] = {0, 0, -1, 1};
        public static int min;
        public static int max;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            N = Integer.parseInt(br.readLine());
            map = new int[N][N];

            int result = 0;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;

            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                for(int j = 0; j < N; j++){
                    int n = Integer.parseInt(st.nextToken());

                    map[i][j] = n;

                    if(n <= min){
                        min = n;
                    }

                    if(n >= max){
                        max = n;
                    }
                }
            }

            for(int height = min - 1; height <= max; height++){

                visited = new boolean[N][N];

                int sum = 0;

                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N; j++){
                        if(!visited[i][j] && map[i][j] > height){
                            BFS(i, j, height);

                            sum = sum + 1;
                        }
                    }
                }

                result = Math.max(result, sum);
            }

            System.out.println(result);

        }

        public static class Node{
            int x;
            int y;

            public Node(int x, int y){
                this.x = x;
                this.y = y;
            }
        }

        public static void BFS(int x, int y, int h){
            Queue<Node> q = new LinkedList<>();

            q.add(new Node(x, y));

            visited[x][y] = true;

            while(!q.isEmpty()){
                Node node = q.poll();

                int nx = node.x;
                int ny = node.y;

                for(int i = 0; i < 4; i++){
                    int mx = nx + dx[i];
                    int my = ny + dy[i];

                    if(mx >= N || mx < 0 || my >= N || my < 0){
                        continue;
                    }

                    if((map[mx][my] > h) && (!visited[mx][my])){
                        visited[mx][my] = true;

                        q.add(new Node(mx, my));
                    }
                }
            }
        }
    }