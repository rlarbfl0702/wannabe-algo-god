import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int min = Integer.MAX_VALUE;
            int sum = 0;

            for(int i = 0; i < 7; i++){
                int n = Integer.parseInt(st.nextToken());

                if(n % 2 == 0){
                    sum = sum + n;

                    if(n < min){
                        min = n;
                    }
                }
            }

            sb.append(sum + " " + min + "\n");
        }

        System.out.println(sb);
    }
}
