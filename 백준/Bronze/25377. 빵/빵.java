import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(n2 >= n1){
                if(min >= n2){
                    min = n2;
                }
            }
        }

        if(min == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(min);
        }
    }
}
