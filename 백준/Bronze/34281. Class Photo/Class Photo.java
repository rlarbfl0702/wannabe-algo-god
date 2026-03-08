import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N1 = new BigInteger(br.readLine());
        BigInteger N2 = new BigInteger(br.readLine());

        System.out.println(N1.multiply(N2));
    }
}