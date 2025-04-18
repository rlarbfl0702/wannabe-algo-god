import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static Character map[][];
    public static int result_max;
    public static int result_min;
    // 최소로 움직이기 위해서는 하, 우 방향만 움직여야 하므로
    public static int dx[] = {1, 0};
    public static int dy[] = {0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new Character[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++){
                char c = st.nextToken().charAt(0);

                map[i][j] = c;
            }
        }

        result_max = Integer.MIN_VALUE;
        result_min = Integer.MAX_VALUE;

        BFS(0, 0);

        System.out.println(result_max + " " + result_min);
    }

    public static class Node{
        int x;
        int y;
        int d;
        char c;

        public Node(int x, int y, int d, char c){
            this.x = x;
            this.y = y;
            this.d = d;
            this.c = c;
        }
    }

    public static void BFS(int x, int y){
        Queue<Node> q = new LinkedList<>();

        // 시작점의 좌표와 출발 거리, 계산식을 Queue에 넣음
        q.add(new Node(x, y, Character.getNumericValue(map[0][0]), ' '));

        while(!q.isEmpty()){
            Node n = q.poll();

            int xx = n.x;
            int yy = n.y;
            int dd = n.d;
            char cc = n.c;

            // 만약 해당 좌표가 지도의 끝지점 이라면
            if((xx == N - 1) && (yy == N - 1)){
                // 해당 좌표에 도착할 때까지 계산한 결과값이 최댓값보다 크다면
                // 최댓값을 갱신
                if(dd >= result_max){
                    result_max = dd;
                }

                // 계산한 결과값이 최솟값보다 작다면 최솟값을 갱신
                if(dd <= result_min){
                    result_min = dd;
                }
            }

            // 아래쪽과 오른쪽으로만 간다면 지도의 끝부분에 도착했을 때
            // 무조건 최소 거리이므로 따로 계산 x
            for(int i = 0; i < 2; i++){
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                // 좌표가 지도를 넘어가면 continue
                if(nx >= N || nx < 0 || ny >= N || ny < 0){
                    continue;
                }

                // 이동한 좌표의 아스키 코드
                int num = (int)map[nx][ny];

                // 만약 이동한 좌표의 아스키코드가 숫자에 해당된다면
                // 이전 좌표의 수식으로 현재까지의 결과값을 계산
                if(num >= 48 && num <= 57){
                    // 이동한 좌표의 문자 데이터 숫자를 진짜 숫자로 변환
                    int nnn = Character.getNumericValue(map[nx][ny]);

                    // 만약 이전 수식이 + 라면
                    // 현재 결과값과 이동한 좌표의 숫자를 더해서 결과값에 저장하고
                    // 저장한 수식을 공백으로 다시 저장
                    if(cc == '+'){
                        q.add(new Node(nx, ny, dd + nnn, ' '));
                    }
                    // 만약 이전 수식이 - 라면
                    // 현재 결과값과 이동한 좌표의 숫자를 빼서 결과값에 저장하고
                    // 저장한 수식을 공백으로 다시 저장
                    else if(cc == '-'){
                        q.add(new Node(nx, ny, dd - nnn, ' '));
                    }
                    // 만약 이전 수식이 * 라면
                    // 현재 결과값과 이동한 좌표의 숫자를 곱해서 결과값에 저장하고
                    // 저장한 수식을 공백으로 다시 저장
                    else if(cc == '*'){
                        q.add(new Node(nx, ny, dd * nnn, ' '));
                    }
                }
                // 만약 이동한 좌표의 아스키코드가 숫자가 아니라면
                // 수식이라는 뜻이므로 수식을 저장하는 곳에 현재 이동한 좌표의 값을 저장
                else{
                    q.add(new Node(nx, ny, dd, map[nx][ny]));
                }
            }
        }
    }
}

