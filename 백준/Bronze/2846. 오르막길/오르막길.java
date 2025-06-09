import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int start = 0;
        int fin = 0;
        int big = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        fin = start;

        boolean TF = false;

        for(int i = 1; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            if(n > fin){
                fin = n;

                TF = true;
            }
            else{
                if(TF){
                    big = Math.max(big, fin - start);
                }

                TF = false;
                start = n;
                fin = n;
                
            }

            if(i == (N - 1)){
                if(TF){
                    big = Math.max(big, fin - start);
                }
            }
        }

        System.out.println(big);
    }
}
