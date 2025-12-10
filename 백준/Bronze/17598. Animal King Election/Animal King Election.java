import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = 0;
        int T = 0;

        for(int i = 0; i < 9; i++){
            String s = br.readLine();

            if(s.equals("Lion")){
                L = L + 1;
            }
            else{
                T = T + 1;
            }
        }

        if(L > T){
            System.out.println("Lion");
        }
        else{
            System.out.println("Tiger");
        }
    }
}