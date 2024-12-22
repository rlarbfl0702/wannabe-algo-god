import java.io.*;
import java.util.*;

public class Main {

    public static int max;
    public static int d[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수빈의 위치
        int N = Integer.parseInt(st.nextToken());

        // 동생의 위치
        int K = Integer.parseInt(st.nextToken());

        // 최대 범위
        max = 100000;
        // 각 거리로 이동하는 최소 시간을 저장할 배열
        d = new int[max + 1];

        // 최소 시간을 저장할 배열을 Integer의 최댓값으로 초기화
        Arrays.fill(d, Integer.MAX_VALUE);

        // 수빈의 시작 위치는 0으로 초기화
        d[N] = 0;

        // 수빈의 위치에서 BFS를 돌림
        BFS(N);

        System.out.println(d[K]);
    }

    public static void BFS(int s){
        Deque<Integer> q = new LinkedList<>();
        // 시작 위치를 Deque에 넣음
        q.add(s);

        // Deque이 비기전까지 반복
        while(!q.isEmpty()){
            // Deque에 있는 위치
            int current = q.poll();

            // 순간 이동한 경우
            // 현재 위치에서 2배 이동한 값이 최대 범위보다 이하이고
            if(current * 2 <= max){
                // 현재 위치에서 2배 이동한 배열의 값이 현재 배열의 값보다 크다면
                if(d[current * 2] > d[current]){
                    // 현재 위치에서 2배 이동한 배열의 값을
                    // 현재 위치의 배열 값으로 변경하고
                    d[current * 2] = d[current];

                    // Deque에 현재 위치의 2배를 곱한 값을 우선적으로 넣음
                    q.addFirst(current * 2);
                }
            }

            // X - 1으로 이동한 경우,
            // 현재 위치에서 -1 이동한 값이 0 이상이고
            if(current - 1 >= 0){
                // 현재 위치에서 -1 이동한 배열의 값이
                // 현재 배열의 값에서 1 더한 값보다 크다면
                if(d[current - 1] > d[current] + 1){
                    // 현재 위치에서 -1 이동한 배열의 값을
                    // 현재 위치의 배열 값에서 1 더한 값으로 변경하고
                    d[current - 1] = d[current] + 1;

                    // Deque에 현재 위치에서 -1한 값을 후 순위로 넣음
                    q.addLast(current - 1);
                }
            }

            // X + 1으로 이동한 경우,
            // 현재 위치에서 +1 이동한 값이 최대 범위 이하이고
            if(current + 1 <= max){
                // 현재 위치에서 +1 이동한 배열의 값이
                // 현재 배열의 값에서 1 더한 값보다 크다면
                if(d[current + 1] > d[current] + 1){
                    // 현재 위치에서 +1 이동한 배열의 값을
                    // 현재 위치의 배열 값에서 1 더한 값으로 변경하고
                    d[current + 1] = d[current] + 1;

                    // Deque에 현재 위치에서 +1한 값을 후 순위로 넣음
                    q.addLast(current + 1);
                }
            }
        }
    }
}
