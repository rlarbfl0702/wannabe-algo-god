import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int a = Integer.parseInt(s.split("")[0]);
        int b = Integer.parseInt(s.split("")[4]);
        int c = Integer.parseInt(s.split("")[8]);

        if(a + b == c){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
