import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int len = s.length();

        String result = "";

        for(int i = len - 1; i >= 0; i--){
            result = result + s.charAt(i);
        }

        System.out.println(result);
    }
}