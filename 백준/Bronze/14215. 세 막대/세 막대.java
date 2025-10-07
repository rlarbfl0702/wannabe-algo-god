import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a, Math.max(b, c));

        if(a == max){
            int sum = b + c;

            if(sum > a){
                System.out.println(a + b + c);
            }
            else{
                System.out.println(2 * sum - 1);
            }
        }
        else if(b == max){
            int sum = a + c;

            if(sum > b){
                System.out.println(a + b + c);
            }
            else{
                System.out.println(2 * sum - 1);
            }
        }
        else if(c == max){
            int sum = a + b;

            if(sum > c){
                System.out.println(a + b + c);
            }
            else{
                System.out.println(2 * sum - 1);
            }
        }
    }
}
