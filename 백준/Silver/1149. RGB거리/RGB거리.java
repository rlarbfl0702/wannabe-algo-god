import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cost[][] = new int[N][3];
        int dp[][] = new int[N][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            cost[i][0] = R;
            cost[i][1] = G;
            cost[i][2] = B;
        }

        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        for(int i = 1; i < N; i++){
            // 현재 R, 전 집의 색이 G,B일 때 중 최소값을 선택
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            // 현재 G, 전 집의 색이 R,B일 때 중 최소값을 선택
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            // 현재 B, 전 집의 색이 R,B맇 깨 중 최소값을 선택
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        int result = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));

        System.out.println(result);
    }
}
