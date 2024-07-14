import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int two = 0;
        int five = 0;

        for(int i=1; i<N+1; i++) {
            int num = i;
            while (num%2==0 || num%5==0) {
                if(num%2 == 0) {
                    two++;
                    num/=2;
                }
                if(num%5 == 0) {
                    five++;
                    num/=5;
                }
            }
        }
        System.out.println(Math.min(two, five));
    }
}
