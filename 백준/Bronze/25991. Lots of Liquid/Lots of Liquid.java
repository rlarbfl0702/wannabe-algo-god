import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double sum = 0;
        double result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            double n = Double.parseDouble(st.nextToken());

            sum = sum + (n * n * n);
        }

        result = Math.cbrt(sum);

        System.out.println(result);
    }
}