import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        int a = 100 - N1;
        int b = 100 - N2;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        int result1 = c + q;
        int result2 = r;

        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println(result1 + " " + result2);
    }
}
