import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int result = 0;

            if(a == b && b == c){
                result = 10000 + a * 1000;
            }
            else if((a != b) && (b != c) && (a != c)){
                int m = Math.max(a, Math.max(b, c));

                result = m * 100;
            }
            else{
                if(a == b){
                    result = 1000 + a * 100;
                }
                else if(a == c){
                    result = 1000 + a * 100;
                }
                else if(b == c){
                    result = 1000 + b * 100;
                }
            }

            if(result > max){
                max = result;
            }
        }

        System.out.println(max);
    }
}
