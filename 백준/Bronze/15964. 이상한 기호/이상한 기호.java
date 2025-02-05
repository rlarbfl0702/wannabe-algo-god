import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger N = new BigInteger(st.nextToken());
        BigInteger M = new BigInteger(st.nextToken());

        BigInteger result = N.add(M);
        BigInteger result2 = N.subtract(M);
        BigInteger result3 = result.multiply(result2);

        System.out.println(result3);
    }
}
