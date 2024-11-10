import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int result = 1;

        for(int i = 0; i < s.length()/2; i++){
            if(!s.split("")[i].equals(s.split("")[s.length() - i - 1])){
                result = 0;
                break;
            }
        }
        
        System.out.println(result);
    }
}