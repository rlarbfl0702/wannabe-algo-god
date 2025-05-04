import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());
        int n4 = Integer.parseInt(st.nextToken());

        System.out.println((56 * n1) + (24 * n2) + (14 * n3) + (6 * n4));
    }
}
