import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 동전의 개수를 저장할 배열
        int dp[] = new int[k + 1];

        // dp[0] 값을 1로 초기화
        dp[0] = 1;

        for(int i = 0; i < n; i++){
            int coin = Integer.parseInt(br.readLine());

            // 해당 동전의 가치값 부터 만들어야 되는 k가치까지 계산
            for(int j = coin; j <= k; j++){
                // j가치의 값은 현재 j가치의 값 + (j - 현재코인 값)가치로 저장
                dp[j] = dp[j] + dp[j - coin];
            }
        }

        System.out.println(dp[k]);
    }
}

