import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S1 = br.readLine();
        String S2 = br.readLine();

        int s1_len = S1.length();
        int s2_len = S2.length();

        // S1의 앞 i개의 문자와 S2의 앞 j개의 문자 사이의
        // LCS 길이를 저장할 배열
        int dp[][] = new int[s1_len + 1][s2_len + 1];

        for(int i = 1; i <= s1_len; i++){
            for(int j = 1; j <= s2_len; j++){
                // S1의 i번째 문자와 S2의 j번째 문자가 같다면
                // S1의 앞 i - 1개와 문자와 S2의 앞 j - 1개의 문자 사이의
                // LCS 길이 + 1값을 S1의 앞 i개의 문자와 S2의 앞 j번째 문자 사이의
                // LCS 길이로 저장
                if(S1.charAt(i - 1) == S2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                // S1의 i번째 문자와 S2의 j번째 문자가 같지 않다면
                // 문자가 S2보다 S1이 1개 더 많은 기준의 LCS길이와
                // 문자가 S1보다 S2가 1개 더 많은 기준의 LCS길이 중,
                // 더 긴 쪽으로 저장
                else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // S1과 S2의 문자열 길이 끝까지 탐색했을 때, 제일 긴 LCS값을 출력
        System.out.println(dp[s1_len][s2_len]);
    }
}
