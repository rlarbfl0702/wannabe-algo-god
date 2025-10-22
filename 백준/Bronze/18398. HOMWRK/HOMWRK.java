import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            int N = Integer.parseInt(br.readLine());

            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                sb.append((A + B) + " " + (A * B) + "\n");
            }
        }

        System.out.println(sb);

    }
}
