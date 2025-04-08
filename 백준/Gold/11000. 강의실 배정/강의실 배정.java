import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int time[][] = new int[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int S = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());

            time[i][0] = S;
            time[i][1] = T;
        }

        // 신청 시작 시간을 기준으로 배열 정렬
        Arrays.sort(time, (a, b) -> {
            // 첫번째 값이 같다면 두번째 값으로 비교
            if(a[0] == b[0]){
                return Integer.compare(a[1], b[1]);
            }

            // 같지 않다면 첫번째 값을 비교 후, 정렬
            return Integer.compare(a[0], b[0]);
        });

        // 수업 갯수 계산할 Queue
        PriorityQueue<Integer> q = new PriorityQueue<>();

        // 첫번째 수업은 무조건 강의실이 필요하니, 끝나는 시간을 큐에 추가
        q.add(time[0][1]);

        for(int i = 1; i < N; i++){
            // 해당 수업의 시작시간이 Queue에 들어있는 시간보다 크거나 같다면
            // 기존에 있던 방을 이어서 수업을 할 수 있으므로
            // 기존 강의실의 끝나는 시간을 제거 후,
            // 새로운 끝나는 시간을 추가
            if(time[i][0] >= q.peek()){
                q.poll();

                q.add(time[i][1]);
            }
            // 만약 해당 수업의 시작시간이 기존에 있던 방의 끝나는 시간보다
            // 작다면, 새로운 강의실이 추가되어야 하므로
            // Queue에 해당 수업의 끝나는 시간을 새로 추가
            else{
                q.add(time[i][1]);
            }
        }

        System.out.println(q.size());
    }
}
