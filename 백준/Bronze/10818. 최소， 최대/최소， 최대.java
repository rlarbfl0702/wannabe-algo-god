import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            if(n < min){
                min = n;
            }

            if(n > max){
                max = n;
            }
        }

        System.out.println(min + " " + max);
    }
}