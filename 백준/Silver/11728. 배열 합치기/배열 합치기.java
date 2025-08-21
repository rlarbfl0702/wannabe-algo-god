import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int AB[] = new int[N + M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            AB[i] = n;
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());

        for(int i = N; i < N + M; i++){
            int m = Integer.parseInt(st3.nextToken());

            AB[i] = m;
        }

        Arrays.sort(AB);

        for(int i = 0; i < N + M; i++){
            sb.append(AB[i] + " ");
        }

        System.out.println(sb);
    }
}
