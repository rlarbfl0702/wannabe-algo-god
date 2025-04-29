import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 가로 길이
        int N = Integer.parseInt(br.readLine());

        // 만약 가로 길이가 홀수라면 절대 채울 수 없으므로 0을 출력
        if(N % 2 == 1){
            System.out.println(0);
        }
        // 가로 길이가 짝수라면
        else{
            // 타일을 채우는 경우의 수를 저장할 배열
            int dp[] = new int[N + 1];

            // 초기값 설정
            // 아무것도 없는 경우를 1로 간주
            dp[0] = 1;
            // 가로가 2일 경우, 3가지 방법이 존재
            dp[2] = 3;

            // 4부터 짝수마다 점화식 적용
            for(int i = 4; i <= N; i = i + 2){
                // i번째 dp 값은 바로 이전 길이의 경우의 수 * 3을 해주고
                dp[i] = dp[i - 2] * 3;

                // 추가로 0이 될때까지 짝수 길이의 경우의 수에 * 2를 해서 i번째 dp 값에 저장
                for(int j = i - 4; j >= 0; j = j - 2){
                    dp[i] = dp[i] + (dp[j] * 2);
                }
            }

            System.out.println(dp[N]);
        }
    }
}
