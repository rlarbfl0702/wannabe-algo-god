import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int len = s.length();

        boolean TF = false;

        // 양끝이 큰 따옴표이고 빈 문자열이 아닐때 TF를 true로 변환
        if(s.split("")[0].equals("\"")){
            if(s.split("")[len - 1].equals("\"")){
                if(len > 2){
                    TF = true;
                }
            }
        }

        if(TF){
            System.out.println(s.substring(1, len - 1));
        }
        else{
            System.out.println("CE");
        }
    }
}
