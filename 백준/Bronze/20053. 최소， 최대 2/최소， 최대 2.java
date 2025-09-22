import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++){
                int n = Integer.parseInt(st.nextToken());

                if(min > n){
                    min = n;
                }

                if(max < n){
                    max = n;
                }
            }

            sb.append(min + " " + max + "\n");
        }

        System.out.println(sb);
    }
}
