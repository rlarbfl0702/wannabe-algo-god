import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=1; i*i<n+1; i++) {
            for(int j=i*i; j<n+1; j++) {
                dp[j] = Math.min(dp[j], dp[j-i*i] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}