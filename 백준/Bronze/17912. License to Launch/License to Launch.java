import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            if(n < min){
                min = n;

                result = i;
            }
        }

        System.out.println(result);
    }
}