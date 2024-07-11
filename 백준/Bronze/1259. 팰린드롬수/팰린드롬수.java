import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if(str.equals("0")) {
                break;
            }
            boolean not_palindrome = false;
            for(int i=0; i<str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                    not_palindrome = true;
                    break;
                }
            }
            if(not_palindrome) {
                sb.append("no");
            }
            else{
                sb.append("yes");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
