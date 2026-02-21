import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String s = br.readLine();

            if(s.equals("0")){
                break;
            }

            int len = s.length();
            int sum = 0;

            while(true){
                for(int i = 0; i < len; i++){
                    int n = Integer.parseInt(s.split("")[i]);

                    sum = sum + n;
                }

                if(sum < 10){
                    sb.append(sum + "\n");
                    break;
                }
                else{
                    len = (sum + "").length();
                    s = sum + "";
                    sum = 0;
                }
            }
        }

        System.out.println(sb);
    }
 }