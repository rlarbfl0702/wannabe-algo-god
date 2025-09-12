import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;

        int result = 0;

        for(int i = 0; i < 7; i++){
            int n = Integer.parseInt(br.readLine());

            if(n % 2 == 1){
                result = result + n;

                if(n < min){
                    min = n;
                }
            }
        }

        if(min == Integer.MAX_VALUE){
            min = -1;

            System.out.println(min);
        }
        else{
            System.out.println(result);
            System.out.println(min);
        }
    }
}
