import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            int N = Integer.parseInt(br.readLine());

            String s = br.readLine();

            int len = s.length();

            for(int i = 0; i < len; i++){
                char c = s.charAt(i);

                if(c == 'c'){
                    N = N + 1;
                }
                else{
                    N = N - 1;
                }
            }

            sb.append("Data Set " + (test + 1) + ":" + "\n");
            sb.append(N + "\n");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
