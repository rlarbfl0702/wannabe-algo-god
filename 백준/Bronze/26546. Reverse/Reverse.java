import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int len = s.length();

            for(int j = 0; j < start; j++){
                sb.append(s.charAt(j));
            }

            for(int j = end; j < len; j++){
                sb.append(s.charAt(j));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}