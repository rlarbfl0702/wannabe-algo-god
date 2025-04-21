import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int len = s.length();

        // 만들 수 있는 방법의 수를 저장할 배열
        int dp[] = new int[len + 1];

        // 초기값으로 1 저장
        // 만들 수 있는 방법이 무조건 한가지는 있으므로
        dp[0] = 1;

        for(int i = 1; i <= len; i++){
            // i번째 문자를 숫자로 바꿈 (한자리 수)
            // dp에 1부터 저장하기 위해 i가 1부터 시작하기 때문에
            // i번째 문자를 찾기 위해서는 i - 1로 문자열에 접근해야됨
            int n = Integer.parseInt(s.split("")[i - 1]);

            // 만약 i번째 숫자가 1-9사이의 수라면
            // 카드로 만들 수 있는 유효한 수이므로
            if((n > 0) && (n <= 9)){
                // i번째 dp값에 i - 1번째 dp값을 더함
                dp[i] = dp[i] + dp[i - 1];
            }

            // 만약 i가 2보다 크거나 같을 경우
            // 두자리 숫자도 만들 수 있으므로 두자리 수 체크
            if(i >= 2){
                // i - 1, i번째 숫자를 잘라서 숫자로 바꿈 (두자리 수)
                int n2 = Integer.parseInt(s.substring(i - 2, i));

                // 만약 만든 두자리 숫자가 10-34 사이의 숫자라면
                // 카드로 만들 수 있는 유효한 수이므로
                if((n2 >= 10) && (n2 <= 34)){
                    // i번째 dp값에 i - 2번째 dp값을 더함
                    dp[i] = dp[i] + dp[i - 2];
                }
            }
        }

        System.out.println(dp[len]);
    }
}

