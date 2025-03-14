import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int people = L * P;

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < 5; i++){
            int N = Integer.parseInt(st2.nextToken());

            sb.append(N - people + " ");
        }

        System.out.println(sb);
    }
}
