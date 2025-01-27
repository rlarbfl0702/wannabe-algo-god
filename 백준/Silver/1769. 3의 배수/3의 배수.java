import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int result = 0;

        int cnt = 0;

        while(true){

            result = 0;

            if(s.length() == 1){
                break;
            }

            for(int i = 0; i < s.length(); i++){

                result = result + (s.charAt(i) - '0');
            }

            s = String.valueOf(result);

            cnt = cnt + 1;
        }

        if(Integer.parseInt(s) % 3 == 0){
            System.out.println(cnt);
            System.out.println("YES");
        }
        else{;
            System.out.println(cnt);
            System.out.println("NO");
        }
    }
}