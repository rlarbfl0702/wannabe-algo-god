import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean TF = true;

        for(int i = 0; i < N; i++){
            int T = Integer.parseInt(br.readLine());

            if(TF){
                if(T < 48){
                    TF = false;
                }
            }
        }

        if(TF){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}