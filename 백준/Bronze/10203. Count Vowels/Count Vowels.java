import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String s = br.readLine();

            int len = s.length();
            int cnt = 0;

            for(int j = 0; j < len; j++){
                String alp = s.split("")[j];

                if(alp.equals("a") || alp.equals("e") || alp.equals("i") || alp.equals("o") || alp.equals("u")){
                    cnt = cnt + 1;
                }
            }

            sb.append("The number of vowels in " + s + " is " + cnt + "." + "\n");
        }

        System.out.println(sb);
    }
}