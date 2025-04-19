import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int d_c = Integer.parseInt(st.nextToken());
        int d_b = Integer.parseInt(st.nextToken());

        int result = 0;

        while(true){
            if(C == 0){
                break;
            }

            if((d_c < 2) && (d_b < 1)){
                break;
            }

            if(d_c >= 2){
                result = result + 1;

                d_c = d_c - 2;

                C = C - 1;
            }
            else if(d_b >= 1){
                result = result + 1;

                d_b = d_b - 1;

                C = C - 1;
            }
        }

        System.out.println(result);
    }
}

