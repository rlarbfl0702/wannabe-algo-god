import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        double arr[] = new double[N];

        for(int i = 0; i < N; i++){
            double d = Double.parseDouble(br.readLine());

            arr[i] = d;
        }

        Arrays.sort(arr);

        for(int i = 0; i < 7; i++){
            double dd = arr[i];

            sb.append(String.format("%.3f", dd) + "\n");
        }

        System.out.println(sb);
    }
}
