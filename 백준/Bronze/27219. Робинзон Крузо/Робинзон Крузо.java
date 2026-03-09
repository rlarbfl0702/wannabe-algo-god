import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int v = N / 5;
        int i = N % 5;

        for(int j = 0; j < v; j++){
            sb.append("V");
        }

        for(int k = 0; k < i; k++){
            sb.append("I");
        }

        System.out.println(sb);
    }
}