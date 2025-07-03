import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int total = w * k;

            int result = total / 2;

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}
