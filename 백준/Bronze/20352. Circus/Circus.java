import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());

        double result = 2.0 * Math.sqrt(a * Math.PI);

        System.out.printf("%.10f\n", result);
    }
}
