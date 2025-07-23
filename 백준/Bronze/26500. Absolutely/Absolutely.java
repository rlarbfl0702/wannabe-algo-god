import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            double n = Double.parseDouble(st.nextToken());
            double m = Double.parseDouble(st.nextToken());

            double result = Math.abs(n - m);

            String s = String.format("%.1f", result);

            sb.append(s + "\n");
        }

        System.out.println(sb);
    }
}
