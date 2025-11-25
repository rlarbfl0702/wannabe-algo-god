import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int A = Integer.parseInt(s.split("")[0]);
        int B = Integer.parseInt(s.split("")[4]);
        int C = Integer.parseInt(s.split("")[8]);


        if(A + B == C){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
