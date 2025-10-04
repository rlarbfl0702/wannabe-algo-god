import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

        int result = S * 1 + M * 2 + L * 3;

        if(result >= 10){
            System.out.println("happy");
        }
        else{
            System.out.println("sad");
        }

    }
}
