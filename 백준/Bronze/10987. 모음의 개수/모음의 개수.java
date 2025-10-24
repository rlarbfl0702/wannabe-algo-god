import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int len = s.length();

        int cnt = 0;

        for(int i = 0; i < len; i++){
            String mo = s.split("")[i];

            if(mo.equals("a") || mo.equals("e") || mo.equals("i") || mo.equals("o") || mo.equals("u")){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}
