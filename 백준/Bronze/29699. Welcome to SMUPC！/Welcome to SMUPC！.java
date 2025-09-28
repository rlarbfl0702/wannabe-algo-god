import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "WelcomeToSMUPC";

        int N = Integer.parseInt(br.readLine());

        int len = s.length();

        int result = N % len;

        if(result == 0){
            result = len;
        }

        System.out.println(s.split("")[result - 1]);
    }
}
