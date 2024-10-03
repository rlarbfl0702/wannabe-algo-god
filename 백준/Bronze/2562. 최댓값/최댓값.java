import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i = 0; i < 9; i++){
            int n = Integer.parseInt(br.readLine());

            if(n > max){
                max = n;
                num = i + 1;
            }

        }

        System.out.println(max + "\n" + num);
    }
}