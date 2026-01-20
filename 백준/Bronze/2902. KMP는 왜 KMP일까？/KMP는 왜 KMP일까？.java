import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int len = s.length();
        int cnt = 0;
        int total = 0;
        String result = "";

        while(true){
            if(total == len + 1){
                break;
            }

            String ss = s.split("-")[cnt];

            total = total + ss.length() + 1;

            result = result + ss.split("")[0];

            cnt = cnt + 1;
        }

        System.out.println(result);
    }
}
