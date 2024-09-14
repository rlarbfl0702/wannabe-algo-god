import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int plus = Integer.parseInt(br.readLine());

        M = M + plus;

        H = H +  M / 60;
        M = M % 60;

        H = H % 24;

        System.out.println(H + " " + M);
    }
}