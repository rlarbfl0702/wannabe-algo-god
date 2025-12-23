import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int len = s.length();

        int cnt_a = 0;
        int cnt_b = 0;

        for(int i = 0; i < len; i++){

            char c = s.charAt(i);

            if(c == 'A'){
                cnt_a = cnt_a + 1;
            }
            else{
                cnt_b = cnt_b + 1;
            }
        }

        System.out.println(cnt_a + " : " + cnt_b);
    }
}