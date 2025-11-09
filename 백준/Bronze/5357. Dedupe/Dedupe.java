import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringBuilder tmp = new StringBuilder();
            char prev = str.charAt(0);
            tmp.append(prev);
            for (int j = 1; j < str.length(); j++) {
                if(prev != str.charAt(j)) {
                    tmp.append(str.charAt(j));
                    prev = str.charAt(j);
                }
            }
            sb.append(tmp).append('\n');
        }

        System.out.println(sb);
    }
}