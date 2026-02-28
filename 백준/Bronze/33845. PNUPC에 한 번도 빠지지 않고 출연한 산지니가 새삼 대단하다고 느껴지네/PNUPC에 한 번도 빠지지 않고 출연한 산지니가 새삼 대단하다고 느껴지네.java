import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();
        String result = T;

        int len = S.length();

        for(int i = 0; i < len; i++){
            String s = S.split("")[i];

            if(T.contains(s)){
                result = result.replaceAll(s,"");
            }
        }

        System.out.println(result);
    }
}