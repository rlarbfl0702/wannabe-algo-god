import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int diff = S - A;
        int total = 250;

        while(true){
            if(diff <= 0){
                break;
            }

            diff = diff - B;

            total = total + 100;
        }

        System.out.println(total);
    }
}
