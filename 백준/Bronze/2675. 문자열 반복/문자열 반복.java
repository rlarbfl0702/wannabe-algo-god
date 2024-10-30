import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            st = new StringTokenizer(br.readLine());
            int times = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int i=0; i<str.length(); i++) {
                for(int j=0; j<times; j++) {
                    answer.append(str.charAt(i));
                }
            }
            answer.append('\n');
        }

        System.out.println(answer);
    }
}