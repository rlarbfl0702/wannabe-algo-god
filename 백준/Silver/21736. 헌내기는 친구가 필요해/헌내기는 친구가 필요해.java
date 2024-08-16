import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static char campus[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static boolean visited[][];
    static int cnt;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 행
        N = Integer.parseInt(st.nextToken());
        // 열
        M = Integer.parseInt(st.nextToken());

        // 캠퍼스를 저장할 2차원 배열
        campus = new char[N][M];
        // 배열의 방문 여부
        visited = new boolean[N][M];
        // 만난 사람의 수
        cnt = 0;

        // 도연의 좌표를 저장할 변수
        int d_x = 0;
        int d_y = 0;

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            for(int j = 0; j < M; j++){
                char c = s.charAt(j);

                // c가 I일 경우, 그 좌표가 도연의 좌표이므로
                // 도연의 좌표를 변수에 저장
                if(c == 'I'){
                    d_x = i;
                    d_y = j;
                }

                // 캠퍼스에 정보를 저장
                campus[i][j] = c;
            }
        }

        // 도연이의 좌표료 BFS를 돌림
        BFS(d_x, d_y);

        if(cnt == 0){
            System.out.println("TT");
        }
        else{
            System.out.println(cnt);
        }
    }

    public static void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();

        // 도연이가 있는 좌표를 Queue에 넣어줌
        q.offer(new Point(x, y));

        // 해당 좌표를 방문처리
        visited[x][y] = true;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            // 좌표값을 변수에 저장
            int node_x = q.peek().x;
            int node_y = q.peek().y;

            q.poll();

            for(int i = 0; i < 4; i++){
                // 상하좌우의 좌표값을 저장
                int nx = node_x + dx[i];
                int ny = node_y + dy[i];

                // 만약 해당 좌표값이 배열범위를 넘어간다면 continue
                if(nx >= N || nx < 0 || ny >= M || ny < 0){
                    continue;
                }

                // 범위안에 들고 해당 노드를 방문하지 않았다면
                if(!visited[nx][ny]){
                    // 해당 노드를 방문처리하고
                    visited[nx][ny] = true;

                    // 만약 해당 배열값이 P라면 사람이 있다는 뜻이므로
                    if(campus[nx][ny] == 'P'){
                        // 사람 수 + 1 하고
                        cnt = cnt + 1;

                        // Queue에 해당 좌표값을 넣음
                        q.offer(new Point(nx, ny));
                    }
                    // 배열값이 O라면 빈 공간이므로
                    else if(campus[nx][ny] == 'O'){
                        // Queue에 해당 좌표값을 넣음
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }

    }
}
