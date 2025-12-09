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
            int M = Integer.parseInt(st.nextToken());

            for(int i = 0; i < M; i++){
                for(int j = 0; j < N; j++){
                    sb.append("X");
                }

                sb.append("\n");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}