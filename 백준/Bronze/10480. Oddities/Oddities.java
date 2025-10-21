import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            if(n % 2 == 0){
                sb.append(n + " is even" + "\n");
            }
            else{
                sb.append(n + " is odd" + "\n");
            }
        }

        System.out.println(sb);
    }
}
