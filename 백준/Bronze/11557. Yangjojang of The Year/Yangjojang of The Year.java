import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            int N = Integer.parseInt(br.readLine());

            int max = Integer.MIN_VALUE;
            String name = "";

            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                String s = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if(n > max){
                    max = n;
                    name = s;
                }
            }

            sb.append(name + "\n");
        }

        System.out.println(sb);
    }
}
