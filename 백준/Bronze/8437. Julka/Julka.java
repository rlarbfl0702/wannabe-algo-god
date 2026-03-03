import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger R = new BigInteger(br.readLine());
        BigInteger two = new BigInteger("2");

        System.out.println(N.add(R).divide(two));
        System.out.println(N.subtract(R).divide(two));
    }
}