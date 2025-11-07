import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean TF = false;

        int N1 = Integer.parseInt(br.readLine());
        int N2 = Integer.parseInt(br.readLine());
        int N3 = Integer.parseInt(br.readLine());
        int N4 = Integer.parseInt(br.readLine());

        if((N1 == 8) || (N1 == 9)){
            if(N2 == N3){
                if((N4 == 8) || (N4 == 9)){
                    System.out.println("ignore");
                }
                else{
                    System.out.println("answer");
                }
            }
            else{
                System.out.println("answer");
            }
        }
        else{
            System.out.println("answer");
        }
    }
}