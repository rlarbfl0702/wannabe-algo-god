import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());


        long r = gcd(N, M);

        long result = (N * M) / r;

        System.out.println(result);
    }

    // 유클리드 호제법
    public static long gcd(long A, long B) {
        if (B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
