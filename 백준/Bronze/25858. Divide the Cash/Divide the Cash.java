import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int total = 0;

        int p[] = new int[N];

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            p[i] = n;

            total = total + n;
        }

        int m = money / total;

        for(int i = 0; i < N; i++){
            sb.append(p[i] * m + "\n");
        }

        System.out.println(sb);
    }
}