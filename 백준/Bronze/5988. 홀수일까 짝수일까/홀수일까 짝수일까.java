import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            BigInteger n = new BigInteger(br.readLine());
            BigInteger two = new BigInteger(2 + "");
            BigInteger zero = new BigInteger(0 + "");

            if(n.mod(two).equals(zero)){
                sb.append("even" + "\n");
            }
            else{
                sb.append("odd" + "\n");
            }
        }

        System.out.println(sb);
    }
}
