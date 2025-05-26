import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 1; test <= T; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = Integer.MIN_VALUE;

            for(int i = 0; i < 5; i++){
                int n = Integer.parseInt(st.nextToken());

                if(n >= max){
                    max = n;
                }
            }

            sb.append("Case #" + test + ": " + max + "\n");
        }

        System.out.println(sb);
    }
}
