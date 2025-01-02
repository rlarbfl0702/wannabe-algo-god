import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger M = new BigInteger(br.readLine());

        BigInteger result1 = N.add(M);
        BigInteger result2 = N.subtract(M);
        BigInteger result3 = N.multiply(M);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}