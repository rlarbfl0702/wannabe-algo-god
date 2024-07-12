import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int lcm = 0;
        int gcd = 0;
        int num = N*M;
        while(true) {
            if(N % M == 0) {
                gcd = M;
                lcm = num / gcd;
                break;
            }
            else{
                int tmp = M;
                M = N % M;
                N = tmp;
            }
        }

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
