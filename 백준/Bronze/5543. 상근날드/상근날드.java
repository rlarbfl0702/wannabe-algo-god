import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.parseInt(br.readLine());
        int J = Integer.parseInt(br.readLine());
        int H = Integer.parseInt(br.readLine());
        int co = Integer.parseInt(br.readLine());
        int ca = Integer.parseInt(br.readLine());

        int b = 0;
        int d = 0;

        b = Math.min(S, Math.min(J, H));
        d = Math.min(co, ca);

        int result = b + d - 50;

        System.out.println(result);
    }
}
