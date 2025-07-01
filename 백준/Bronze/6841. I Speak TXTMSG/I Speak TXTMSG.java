import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String s = br.readLine();

            if(s.equals("TTYL")){
                sb.append("talk to you later" + "\n");

                break;
            }

            if(s.equals("CU")){
                sb.append("see you" + "\n");
            }
            else if(s.equals(":-)")){
                sb.append("I’m happy" + "\n");
            }
            else if(s.equals(":-(")){
                sb.append("I’m unhappy" + "\n");
            }
            else if(s.equals(";-)")){
                sb.append("wink" + "\n");
            }
            else if(s.equals(":-P")){
                sb.append("stick out my tongue" + "\n");
            }
            else if(s.equals("(~.~)")){
                sb.append("sleepy" + "\n");
            }
            else if(s.equals("TA")){
                sb.append("totally awesome" + "\n");
            }
            else if(s.equals("CCC")){
                sb.append("Canadian Computing Competition" + "\n");
            }
            else if(s.equals("CUZ")){
                sb.append("because" + "\n");
            }
            else if(s.equals("TY")){
                sb.append("thank-you" + "\n");
            }
            else if(s.equals("YW")){
                sb.append("you’re welcome" + "\n");
            }
            else{
                sb.append(s + "\n");
            }
        }

        System.out.println(sb);
    }
}
