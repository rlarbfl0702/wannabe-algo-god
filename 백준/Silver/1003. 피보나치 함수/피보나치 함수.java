import java.io.*;
import java.util.*;

public class Main {

    static int fibo[][];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            // 수를 구할
            int N = Integer.parseInt(br.readLine());

            fibo = new int[N + 1][2];

            // 0의 피보나치 수 결과값
            fibo[0][0] = 1;
            fibo[0][1] = 0;

            if(N > 0){
                dp(N);
            }

            sb.append(fibo[N][0] + " " + fibo[N][1] + "\n");
        }
        System.out.println(sb);
    }

    public static void dp(int n){
        // 1의 피보나치 수 결과값
        fibo[1][0] = 0;
        fibo[1][1] = 1;

        for(int i = 2; i <= n; i++){
            fibo[i][0] = fibo[i - 1][0] + fibo[i - 2][0];
            fibo[i][1] = fibo[i - 1][1] + fibo[i - 2][1];
        }
    }
}
