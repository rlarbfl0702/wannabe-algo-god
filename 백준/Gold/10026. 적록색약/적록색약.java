import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static char RGB[][];
    static char RB[][];
    static boolean rgb_visited[][];
    static boolean rb_visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 행, 열
        N = Integer.parseInt(br.readLine());

        // 적록색약이 아닌 사람이 보는걸 저장할 배열
        RGB = new char[N][N];
        // 적록색약인 사람이 보는걸 저장할 배열
        RB = new char[N][N];
        // 적록색약이 아닌 사람의 방문처리 배열
        rgb_visited = new boolean[N][N];
        // 적록색약인 사람의 방문처리 배열
        rb_visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            for(int j = 0; j < N; j++){
                char c = s.charAt(j);

                // 적록색약이 아닌 사람은 그대로 배열에 저장
                RGB[i][j] = c;

                // 입력값이 G가 들어온다면 적록색약인 사람들은
                // R과 같이 보기 때문에 R로 저장
                if(c == 'G'){
                    RB[i][j] = 'R';
                }
                // G가 아닐 때는 적록색약이 아닌 사람처럼 그대로 저장
                else{
                    RB[i][j] = c;
                }
            }
        }

        int rgb_cnt = 0;
        int rb_cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                // 적록색맹이 아닌 사람들을 저장해놓은 배열에서
                // 방문하지 않은 좌표를 만났다면
                if(!rgb_visited[i][j]){
                    // 해당 좌표를 기준으로 BFS를 돌리고
                    RGB_BFS(RGB[i][j], i, j);

                    // 적록색맹이 아닌 사람들이 보는 구역 카운트 + 1
                    rgb_cnt = rgb_cnt + 1;
                }

                // 적록색맹인 사람들을 저장해놓은 배열에서
                // 방문하지 않은 좌표를 만났다면
                if(!rb_visited[i][j]){
                    // 해당 좌표를 기준으로 BFS를 돌리고
                    RB_BFS(RB[i][j], i, j);

                    // 적록색맹인 사람들이 보는 구역 카운트 + 1
                    rb_cnt = rb_cnt + 1;
                }
            }
        }

        System.out.println(rgb_cnt + " " + rb_cnt);
    }

    // 적록색맹이 아닌 사람들을 위한 BFS
    public static void RGB_BFS(char color, int x, int y){
        Queue<Point> q = new LinkedList<>();

        // 입력들어온 색깔을 따로 저장
        char c = color;

        // 입력들어온 좌표를 Queue에 저장
        q.offer(new Point(x, y));

        rgb_visited[x][y] = true;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int xx = q.peek().x;
            int yy = q.peek().y;

            q.poll();

            // 기준좌표에서 상하좌우 이동
            for(int i = 0; i < 4; i++){
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 이동한 좌표가 범위를 벗어난다면 continue
                if(nx >= N || nx < 0 || ny >= N || ny < 0){
                    continue;
                }

                // 만약 해당 좌표를 아직 방문하지 않았고 입력들어온 색깔과 같다면
                // 같은 범위로 보고 있는 것이므로
                if(!rgb_visited[nx][ny] && (RGB[nx][ny] == c)){
                    // 해당 좌표를 방문처리하고
                    rgb_visited[nx][ny] = true;
                    // Queue에 해당 좌표를 넣음
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

    // 적록색맹인 사람들을 위한 BFS
    public static void RB_BFS(char color, int x, int y){
        Queue<Point> q = new LinkedList<>();

        // 입력들어온 색깔을 따로 저장
        char c = color;

        // 입력들어온 좌표를 Queue에 저장
        q.offer(new Point(x, y));

        rb_visited[x][y] = true;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int xx = q.peek().x;
            int yy = q.peek().y;

            q.poll();

            // 기준좌표에서 상하좌우 이동
            for(int i = 0; i < 4; i++){
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 만약 이동한 좌표가 범위를 벗어난다면 continue
                if(nx >= N || nx < 0 || ny >= N || ny < 0){
                    continue;
                }

                // 만약 해당 좌표를 아직 방문하지 않았고 입력들어온 색깔과 같다면
                // 같은 범위로 보고 있는 것이므로
                if(!rb_visited[nx][ny] && (RB[nx][ny] == c)){
                    // 해당 좌표를 방문처리하고
                    rb_visited[nx][ny] = true;
                    // Queue에 해당 좌표를 넣음
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }
}
