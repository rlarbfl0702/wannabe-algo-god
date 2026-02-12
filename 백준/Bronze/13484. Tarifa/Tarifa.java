import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int total = X * N;

        for(int i = 0; i < N; i++){
            int P = Integer.parseInt(br.readLine());

            total = total - P;
        }

        System.out.println(total + X);
    }
 }