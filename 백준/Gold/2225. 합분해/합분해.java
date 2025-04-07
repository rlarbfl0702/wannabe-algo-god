import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int dp[][] = new int[K + 1][N + 1];

        // 숫자 1개를 써서 해당 숫자를 만드는 방법은 1개뿐이므로
        // N까지의 숫자를 정수 1개로 만들 수 있는 방법의 갯수를 저장하는
        // 값을 1로 저장
        for(int i = 1; i <= N; i++){
            dp[1][i] = 1;
        }

        // 1을 숫자 i개를 써서 만드는 방법은 i개이므로
        // 갯수를 i로 저장
        // 예를 들어 1을 숫자 2개로 만드는 방법은 [1, 0], [0, 1] 이렇게 2가지
        // 1을 3개로 만드는 방법은 [1, 0, 0], [0, 1, 0], [0, 0, 1] 이렇게 3가지
        for(int i = 2; i <= K; i++){
            dp[i][1] = i;
        }

        // dp[k][i]의 갯수는 dp[k - 1][i]와 dp[k][i - 1]의 값과 같기 떼문에
        // 해당 값을 dp[k][i]에 저장
        for(int i = 2; i <= K; i++){
            for(int j = 1; j <= N; j++){
                // 1을 만드는 방법의 갯수는 이미 저장되어 있으므로 continue
                if(j == 1) {
                    continue;
                }

                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000000;
            }
        }

        System.out.println(dp[K][N]);
    }
}
