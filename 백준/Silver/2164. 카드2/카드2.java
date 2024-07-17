import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = 1;

        if(N == 1) {
            System.out.println(1);
            return;
        }

        while(num < N) {
            num *= 2;
        }
        num /= 2;
        System.out.println((N-num)*2);


        // 1,
        // 2,
        // 2,4,
        // 2,4,6,8,
        // 2,4,6,8,10,12,14,16,
        // 2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32
    }
}