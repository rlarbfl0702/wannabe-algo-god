import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int test = 0; test < N; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cnt = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int i = 0; i < s.length(); i++){
                for(int  j = 0; j < cnt; j++){
                    sb.append(s.charAt(i));
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}