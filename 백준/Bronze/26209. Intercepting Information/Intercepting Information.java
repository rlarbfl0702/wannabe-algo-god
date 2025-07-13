import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean TF = false;

        for(int i = 0; i < 8; i++){
            int n = Integer.parseInt(st.nextToken());

            if(!TF){
                if(!((n == 0) || (n == 1))){
                    TF = true;
                }
            }
        }

        if(TF){
            System.out.println("F");
        }
        else{
            System.out.println("S");
        }
    }
}
