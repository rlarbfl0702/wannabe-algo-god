import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int n = (N - 1) / 8;
        int m = (N - 1) % 8;

        char c1 = (char)('a' + m);

        System.out.println(c1 + "" + (n + 1));
    }
}