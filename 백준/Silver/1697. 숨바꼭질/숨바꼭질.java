import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int K;
    static int time[];
    static boolean visited[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수빈이가 있는 위치
        N = Integer.parseInt(st.nextToken());
        // 동생이 있는 위치
        K = Integer.parseInt(st.nextToken());

        // 걸리는 시간을 저장할 배열
        time = new int[100001];

        // 방문 여부 체크
        visited = new boolean[100001];

        BFS(N, K);

        System.out.println(time[K]);
    }

    public static void BFS(int x, int y){
        Queue<Integer> q = new LinkedList<>();

        q.offer(x);

        // 시작 지점을 방문 처리
        visited[x] = true;

        // 시작지점에서 시작지점까지 걸리는 시간은 0이므로 0으로 초기화
        time[x] = 0;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int n = q.poll();

            // 현재 위치와 도착 위치가 같다면 반복문 종료
            if(n == y){
                break;
            }

            // 이동한 좌표를 저장할 배열
            int move[] = {n - 1, n + 1, n * 2};

            // 이동한 좌표들 즁
            for(int i : move){
                // 범위를 넘어가면 continue
                if(i < 0 || i > 100000){
                   continue;
                }

                // 방문하지 않은 좌표가 있다면
                if(!visited[i]){
                    // 해당 좌표의 시간을 기준 시간 + 1로 저장하고
                    time[i] = time[n] + 1;
                    // 방문 처리 후
                    visited[i] = true;
                    // Queue에 넣음
                    q.offer(i);
                }
            }
        }
    }
}
