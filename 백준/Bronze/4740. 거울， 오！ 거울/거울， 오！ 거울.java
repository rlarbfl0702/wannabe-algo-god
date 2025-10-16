import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){

            String s = br.readLine();

            if(s.equals("***")){
                break;
            }

            int len = s.length();

            String result = "";

            for(int i = len - 1; i >= 0; i--){
                result = result + s.split("")[i];
            }

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}
