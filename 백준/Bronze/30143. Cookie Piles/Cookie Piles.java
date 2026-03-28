import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            int result = A;

            for(int i = 1; i < N; i++){
                result = result + (A + D * i);
            }

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}