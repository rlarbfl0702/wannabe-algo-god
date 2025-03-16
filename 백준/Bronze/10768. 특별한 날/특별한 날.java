import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        if(N < 2){
            System.out.println("Before");
        }
        else if(N == 2){
            if(M < 18){
                System.out.println("Before");
            }
            else if(M == 18){
                System.out.println("Special");
            }
            else if(M > 18){
                System.out.println("After");
            }
        }
        else if(N > 2){
            System.out.println("After");
        }
    }
}
