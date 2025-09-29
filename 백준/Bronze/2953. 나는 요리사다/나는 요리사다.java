import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int num = 0;

        for(int i = 1; i <= 5; i++){
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 4; j++){
                int n = Integer.parseInt(st.nextToken());

                sum = sum + n;
            }

            if(sum > max){
                max = sum;

                num = i;
            }
        }

        System.out.println(num + " " + max);
    }
}
