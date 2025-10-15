import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(br.readLine());
        String s = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        if(s.equals("+")){
            System.out.println(A.add(B));
        }
        else if(s.equals("*")){
            System.out.println(A.multiply(B));
        }
    }
}
