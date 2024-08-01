import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int index = 0;
        int check = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '-' || str.charAt(i) == '+') {
                break;
            }
            sb.append(str.charAt(i));
            check++;
        }

        if(check == str.length()){
            System.out.println(sb);
            return;
        }
        int result = Integer.parseInt(sb.toString());
        sb = new StringBuilder();

        boolean foundMinus = false;
        boolean startCnt = false;

        char tmp = ' ';


        while(index < str.length()) {
            char c = str.charAt(index);
            if(c == '+' || c == '-') {
                if(startCnt) {
                    if (tmp == '-' || foundMinus) {
                        result -= Integer.parseInt(sb.toString());
                    } else {
                        result += Integer.parseInt(sb.toString());
                    }
                    sb = new StringBuilder();
                }
                if(c == '-') {
                    foundMinus = true;
                }
                tmp = c;
                startCnt = true;
            }
            else if(startCnt) {
                sb.append(str.charAt(index));
            }
            index++;
        }

        if(foundMinus) {
            result -= Integer.parseInt(sb.toString());
        }
        else{
            result += Integer.parseInt(sb.toString());
        }
        System.out.println(result);
    }
}
