import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            result = result + n;
        }

        result = result + (N - 1) * 8;

        int d = result / 24;
        int h = result % 24;

        System.out.println(d + " " + h);
    }
}
