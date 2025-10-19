import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[11];
        int answer = 0;

        for(int i=0; i<11; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            double l = Double.parseDouble(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            if(s>16 && l >= 2.0) {
                answer += arr[b];
            }
        }
        System.out.println(answer);
    }
}
