import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX_SIZE = 1_000_001;
        int[] dp = new int[MAX_SIZE];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 0;

        int X = Integer.parseInt(br.readLine());
        for(int i=1; i<=X; i++){
            if(i*3 < MAX_SIZE) {
                dp[i*3] = Math.min(dp[i*3], dp[i] + 1);
            }
            if(i*2 < MAX_SIZE) {
                dp[i*2] = Math.min(dp[i*2], dp[i] + 1);
            }
            if(i+1 < MAX_SIZE) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
        }

        System.out.println(dp[X]);
    }
}