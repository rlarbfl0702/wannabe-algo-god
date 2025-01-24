import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger M = new BigInteger(br.readLine());

        BigInteger result = N.add(M);

        System.out.println(result);
    }
}
