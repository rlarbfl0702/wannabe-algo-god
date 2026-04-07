import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int cnt = 0;
        int len = s.length();
        boolean b = false;
        int result = 0;

        for(int i = 0; i < len; i++){
            char c = s.charAt(i);

            if(c != '0'){
                if(b){
                    result = result + cnt;
                    cnt = 0;
                }
                else{
                    b = true;
                }
            }
            else{
                if(b){
                    cnt = cnt + 1;
                }
            }
        }

        System.out.println(result);
    }
}