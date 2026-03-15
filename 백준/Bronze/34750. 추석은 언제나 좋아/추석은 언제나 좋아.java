import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int parent = 0;
        if (N >= 1_000_000) {
            parent = N/100*20;
        } else if (N >= 500_000) {
            parent = N/100*15;
        } else if (N >= 100_000) {
            parent = N / 100 * 10;
        } else {
            parent = N/100*5;
        }
        System.out.println(parent + " " + (N-parent));
    }
}