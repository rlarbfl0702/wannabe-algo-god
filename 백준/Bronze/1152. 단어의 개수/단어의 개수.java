import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean TF = false;
        int cnt = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!TF){
                if(c == ' '){
                    continue;
                }
                else{
                    TF = true;
                }
            }
            else{
                if(c == ' '){
                    cnt = cnt + 1;
                    TF = false;
                }
            }

            if(i == (s.length() - 1)){
                if(TF){
                    cnt = cnt + 1;
                }
            }
        }

        System.out.println(cnt);
    }
}