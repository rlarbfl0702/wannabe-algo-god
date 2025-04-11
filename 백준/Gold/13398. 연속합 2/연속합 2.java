import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            arr[i] = n;
        }

        // dp[i][0] -> i번째까지 수를 제거하지 않은 경우
        // dp[i][1] -> i번째까지에서 수를 하나 제거한 경우
        int dp[][] = new int[N][2];

        // 첫번째 수는 초기값으로 설정
        dp[0][0] = arr[0];
        // 첫번째에서 수를 하나 제거하면 0이므로 0
        dp[0][1] = 0;

        int result = arr[0];

        for(int i = 1; i < N; i++){
            // i번째까지 숫자를 하나 제거를 하지 않은 값에는
            // 이전 값에서 현재값을 더한 값과 현재값만을 비교해서
            // 더 큰 값을 dp에 저장
            dp[i][0] = Math.max(dp[i - 1][0] + arr[i], arr[i]);

            // i번째까지 숫자를 하나 제거한 값에는
            // 이전에 숫자를 하나 제거한 값에 현재 값을 더한 값과
            // 이번에 현재 i번째 값을 제거하여 i - 1번째까지 숫자를 제거하지 않은 값 중
            // 더 큰 값을 dp에 저장
            dp[i][1] = Math.max(dp[i - 1][1] + arr[i] , dp[i - 1][0]);

            result = Math.max(result, Math.max(dp[i][0], dp[i][1]));
        }

        System.out.println(result);
    }
}
