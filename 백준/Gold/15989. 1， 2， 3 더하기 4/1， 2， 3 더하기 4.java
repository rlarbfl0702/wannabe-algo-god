import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        // dp[i][j]는 i를 1-j번째 숫자까지만 사용해서 만드는 방법의 수
        // 예를 들어 3은 dp[3][1] = 1 (1,1,1), dp[3][2] = 2 ((1,2), (1,1,1)),
        // dp[3][3] = 3 ((1,1,1), (1,2), 3)으로
        // 총 방법의 수는 3개임
        int dp[][] = new int[10001][4];

        // 0을 만드는 방법의 갯수를 1로 초기화
        for(int j = 1; j <= 3; j++){
            dp[0][j] = 1;
        }

        for(int i = 1; i <= 10000; i++){
            for(int j = 1; j <= 3; j++){
                // j번째 숫자까지 사용하는 방법의 수를
                // j - 1번째까지 사용한 방법의 수로 초기화 (누적해서 더해야되기 때문)
                dp[i][j] = dp[i][j - 1];

                // (i - j)가 0이상일 경우
                if((i - j) >= 0){
                    // i를 (j - 1)번째까지의 숫자를 사용한 방법의 수와
                    // (i - j)를 j번째까지의 숫자를 사용한 방법의 수를 더해서
                    // i를 j번째까지의 숫자를 사용한 방법의 수에 저장
                   dp[i][j] = dp[i][j] + dp[i - j][j];
                }
            }
        }

        for(int test = 0; test < T; test++){
            int n = Integer.parseInt(br.readLine());

            sb.append(dp[n][3] + "\n");
        }

        System.out.println(sb);
    }
}

