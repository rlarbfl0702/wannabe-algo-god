import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            String fs = s.split("")[0].toUpperCase();

            sb.append(fs + s.substring(1, s.length()) + "\n");
        }

        System.out.println(sb);
    }
}
