import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double N = Double.parseDouble(br.readLine());

        int criteria = 100_000_000;

        System.out.println(N*N > criteria ? "Time limit exceeded" : "Accepted");
    }
}