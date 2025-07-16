import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

         int N1 = Integer.parseInt(st.nextToken());
         int M1 = Integer.parseInt(st.nextToken());
         int N2 = Integer.parseInt(st.nextToken());
         int M2 = Integer.parseInt(st.nextToken());

        int start = N1 * 60 + M1;
        int end = N2 * 60 + M2;

        if (end < start) {
            end = end + 24 * 60;
        }
        
        int result = end - start;

        System.out.println(result + " " + result / 30);
    }
}
