import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        boolean TF = true;

        char f = s.charAt(0);

        for(int i = 0; i < N; i++){
            char c = s.charAt(i);

            if(c != f){
                TF = false;

                break;
            }
        }

        if(TF){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}