import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a + b == c) {
            System.out.println(a+"+"+b+"="+c);
        } else if (a - b == c) {
            System.out.println(a+"-"+b+"="+c);
        } else if (a * b == c) {
            System.out.println(a+"*"+b+"="+c);
        } else if (b != 0 && a / b == c) {
            System.out.println(a+"/"+b+"="+c);
        } else if (b + c == a) {
            System.out.println(a+"="+b+"+"+c);
        } else if (b - c == a) {
            System.out.println(a+"="+b+"-"+c);
        } else if (b * c == a) {
            System.out.println(a+"="+b+"*"+c);
        } else if (c != 0 && b / c == a) {
            System.out.println(a+"="+b+"/"+c);
        }

    }
}