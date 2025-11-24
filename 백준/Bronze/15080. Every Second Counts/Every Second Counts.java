import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String F = br.readLine();

        int H1 = Integer.parseInt(S.split(" : ")[0]);
        int M1 = Integer.parseInt(S.split(" : ")[1]);
        int S1 = Integer.parseInt(S.split(" : ")[2]);

        int H2 = Integer.parseInt(F.split(" : ")[0]);
        int M2 = Integer.parseInt(F.split(" : ")[1]);
        int S2 = Integer.parseInt(F.split(" : ")[2]);

        int sum1 = S1 + (M1 * 60) + (H1 * 60 * 60);
        int sum2 = S2 + (M2 * 60) + (H2 * 60 * 60);

        if(H1 <= H2){
            if(sum1 >= sum2){
                System.out.println((60 * 60 * 24) - sum1 + sum2);
            }
            else{
                System.out.println(sum2 - sum1);
            }
        }
        else{
            System.out.println((60 * 60 * 24) - sum1 + sum2);
        }
    }
}
