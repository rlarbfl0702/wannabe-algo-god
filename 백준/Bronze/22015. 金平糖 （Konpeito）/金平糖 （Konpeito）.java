import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int max = Math.max(A, Math.max(B, C));

        if(max == A){
            System.out.println((A - B) + (A - C));
        }
        else if(max == B){
            System.out.println((B - A) + (B - C));
        }

        else if(max == C){
            System.out.println((C - A) + (C - B));
        }
    }
}
