import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double x = Double.parseDouble(br.readLine());
        double g = 3.785411784;
        double m = 1.609344;
        double k = 100.0;

        double answer = g*k/m/x;
        System.out.printf("%.6f", answer);
    }
}