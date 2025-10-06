import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int result1 = 0;
        int result2 = 0;

        if(N % A != 0){
            result1 = B * ((N / A) + 1);
        }
        else{
            result1 = B * (N / A);
        }

        if(N % C != 0){
            result2 = D * ((N / C) + 1);
        }
        else{
            result2 = D * (N / C);
        }

        System.out.println(Math.min(result1, result2));
    }
}
