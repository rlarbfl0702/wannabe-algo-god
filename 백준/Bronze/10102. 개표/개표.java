import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int Acnt = 0;
        int Bcnt = 0;

        for(int i = 0; i < N; i++){
            String ab = s.split("")[i];

            if(ab.equals("A")){
                Acnt = Acnt + 1;
            }
            else{
                Bcnt = Bcnt + 1;
            }
        }

        if(Acnt > Bcnt){
            System.out.println("A");
        }
        else if(Bcnt > Acnt){
            System.out.println("B");
        }
        else{
            System.out.println("Tie");
        }
    }
}
