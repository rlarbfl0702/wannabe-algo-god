import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        if(N <= 60){
            System.out.println(N * 1500);
        }
        else{
            int l = N - 60;

            if(l <= K){
                System.out.println(60 * 1500 + l * 1500);
            }
            else{
                System.out.println(60 * 1500 + K * 1500 + (l - K) * 3000);
            }
        }
    }
}