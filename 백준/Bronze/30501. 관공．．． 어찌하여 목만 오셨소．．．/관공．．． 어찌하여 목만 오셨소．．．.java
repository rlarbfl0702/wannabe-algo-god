import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean TF = false;

        String result = "";

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            if(!TF){
                if(s.contains("S")){
                    TF = true;

                    result = s;
                }
            }
        }

        System.out.println(result);
    }
}
