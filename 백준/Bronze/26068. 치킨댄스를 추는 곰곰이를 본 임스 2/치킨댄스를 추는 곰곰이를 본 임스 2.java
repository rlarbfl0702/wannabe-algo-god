import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            int len = s.length();

            int n = Integer.parseInt(s.substring(2, len));

            if(n <= 90){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}
