import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double C = Integer.parseInt(st.nextToken());

        int answer = 0;
        answer = Math.max((int)(A*B/C), (int)(A/B*C));

        System.out.println(answer);
    }
}