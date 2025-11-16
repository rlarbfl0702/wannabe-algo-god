import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int p1 = Integer.parseInt(st.nextToken());
        int q1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int q2 = Integer.parseInt(st.nextToken());


        long num = (long) p1 * (long) p2;
        long den = 2L * (long) q1 * (long) q2; 

        if(num % den == 0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
