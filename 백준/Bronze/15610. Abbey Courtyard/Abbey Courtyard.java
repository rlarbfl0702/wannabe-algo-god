import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double D = Double.parseDouble(br.readLine());

        Double N = Math.sqrt(D);

        System.out.println(4 * N);
    }
}