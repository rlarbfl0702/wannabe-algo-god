import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 1;

        while(true){

            if(N == 1){
                break;
            }

            if(N % 2 == 0){
                N = N / 2;
            }
            else{
                N = 3 * N + 1;
            }

            cnt = cnt + 1;
        }

        System.out.println(cnt);
    }
}