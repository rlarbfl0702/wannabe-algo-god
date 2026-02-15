import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        int len = s.length();

        for(int i = 0; i < len; i++){
            char c = s.charAt(i);

            if(c == 'a'){
                sb.append(4);
            }
            else if(c == 'e'){
                sb.append(3);
            }
            else if(c == 'i'){
                sb.append(1);
            }
            else if(c == 'o'){
                sb.append(0);
            }
            else if(c == 's'){
                sb.append(5);
            }
            else{
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
 }