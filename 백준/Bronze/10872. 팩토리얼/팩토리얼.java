import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 1;

        if(N == 0){
            System.out.println(result);
        }
        else{
            while(true){
                if(N == 0){
                    break;
                }

                result = result * N;

                N = N - 1;
            }

            System.out.println(result);

        }
    }
}
