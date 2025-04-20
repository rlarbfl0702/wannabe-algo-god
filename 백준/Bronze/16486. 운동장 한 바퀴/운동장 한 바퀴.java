import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        double result = d1 * 2 + (2 * d2 * 3.141592);

        System.out.println(result);
    }
}

