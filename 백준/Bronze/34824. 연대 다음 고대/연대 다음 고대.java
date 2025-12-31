import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        boolean TF = false;

        boolean result = false;

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            if(!result){
                if(!TF){
                    if(s.equals("korea")){
                        TF = true;
                    }

                    if(s.equals("yonsei")){
                        result = true;
                    }
                }
            }
        }

        if(result){
            System.out.println("Yonsei Won!");
        }
        else{
            System.out.println("Yonsei Lost...");
        }
    }
}