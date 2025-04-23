import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 상담 시간과 이익을 저장할 배열
        int work[][] = new int[N + 1][2];
        // 각 시간에 얻을 수 있는 최대의 이익을 저장할 배열
        int dp[] = new int[N + 1];

        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int T = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            // 상담 시간과 이익을 입력받음
            work[i][0] = T;
            work[i][1] = P;
        }

        for(int i = 1; i <= N; i++){
            // i번째 일을 하기 전에
            // i시간까지 일했을 때 최대 이익 값을 i번째 값과
            // i - 1번째 값을 비교하여 저장
            dp[i] = Math.max(dp[i], dp[i - 1]);

            // 현재 시간에서 해당 일을 했을 때 끝나는 시간이
            // 퇴직하는 날을 넘어가지 않는다면 (당일도 일하는 날짜로 계산되므로 1을 빼줌)
            if(i + (work[i][0] - 1) <= N){
                // i번째 일을 했을 경우 때 끝나는 시간의 최대 이익과
                // 하지 않았을 때의 끝나는 시간의 최대 이익을 비교하여
                // 더 큰 값을 끝나는 시간의 최대 이익에 저장
                dp[i + work[i][0] - 1] = Math.max(dp[i + work[i][0] - 1], dp[i - 1] + work[i][1]);

            }
        }

        System.out.println(dp[N]);
    }
}

