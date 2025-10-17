import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while(true){

            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                break;
            }

            if(n % N == 0){
                sb.append(n + " is a multiple of " + N + "." + "\n");
            }
            else{
                sb.append(n + " is NOT a multiple of " + N + "." + "\n");
            }

        }

        System.out.println(sb);
    }
}
