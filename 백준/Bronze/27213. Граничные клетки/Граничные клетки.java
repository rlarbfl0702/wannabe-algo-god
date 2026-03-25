import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());


        int result = 0;

        if(M < 3 || N < 3){
            result = M * N;
        }
        else if(M >=  3 && N >= 3){
            result = (M * N) - ((M - 2) * (N - 2));
        }

        System.out.println(result);
    }
}