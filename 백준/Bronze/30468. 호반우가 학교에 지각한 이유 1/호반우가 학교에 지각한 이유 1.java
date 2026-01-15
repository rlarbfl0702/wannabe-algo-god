import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = 0;

        for (int i = 0; i < 4; i++) {
            total += Integer.parseInt(st.nextToken());
        }

        int N = Integer.parseInt(st.nextToken());

        int need = 4 * N - total;

        if (need <= 0) {
            System.out.println(0);
        } else {
            System.out.println(need);
        }
    }
}
