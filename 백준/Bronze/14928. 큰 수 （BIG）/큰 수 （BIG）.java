import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        long result = 0;

        for(int i = 0; i < s.length(); i++) {
            result = (result * 10 + (Character.getNumericValue(s.charAt(i)))) % 20000303;
        }

        System.out.println(result);
    }
}
