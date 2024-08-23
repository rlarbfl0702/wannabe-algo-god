import java.io.*;
import java.util.*;
import java.awt.*;

public class Main {

    static int N;
    static int map[][];
    static boolean visited[][];
    static ArrayList<Integer> result;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 행, 열
        N = Integer.parseInt(br.readLine());
        // 지도
        map = new int[N][N];
        // 방문 여부
        visited = new boolean[N][N];
        // 결과값을 저장할 ArrayList
        result = new ArrayList<>();

        // 지도 입력
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                int n = Integer.parseInt(s.split("")[j]);

                map[i][j] = n;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                // 만약 해당 좌표를 방문하지 않았는데
                // 값이 1이라면
                if(!visited[i][j] && (map[i][j] == 1)){
                    int cnt = BFS(i, j);

                    // return한 사람수를 ArrayList에 넣어줌
                    result.add(cnt);
                }
            }
        }

        // 오름차순으로 정렬
        Collections.sort(result);

        sb.append(result.size() + "\n");

        for(int i : result){
            sb.append(i + "\n");
        }

        System.out.println(sb);
    }

    public static int BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();

        // 들어온 좌표값을 Queue에 넣어줌
        q.offer(new Point(x, y));

        // 해당 좌표 방문 처리
        visited[x][y] = true;

        // 사람 수
        int people = 1;

        // Queue가 빌때까지
        while(!q.isEmpty()){
            // Queue에 저장된 좌표값
            int xx = q.peek().x;
            int yy = q.peek().y;

            q.poll();

            // 꺼낸 좌표 기준으로 상하좌우 탐색
            for(int i = 0; i < 4; i++){
                // 상하좌우로 이동한 좌표값
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 배열 범위값을 벗어나면 continue
                if(nx >= N || nx < 0 || ny >= N || ny < 0){
                    continue;
                }

                // 만약 이동한 좌표값을 아직 방문하지 않았고
                // 값이 1이라면
                if(!visited[nx][ny] && (map[nx][ny] == 1)){
                    // 방문 처리 후
                    visited[nx][ny] = true;
                    // 사람 수 + 1을 하고
                    people = people + 1;
                    // Queue에 해당 좌표값을 넣어줌
                    q.offer(new Point(nx, ny));
                }
            }
        }

        // 카운트한 사람 수 return
        return people;
    }
}
