import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int result = M - N;

        if(result <= 0){
            System.out.println("Congratulations, you are within the speed limit!");
        }
        else if(result >= 1 && result <= 20){
            System.out.println("You are speeding and your fine is $" + 100 + ".");
        }
        else if(result >= 21 && result <= 30){
            System.out.println("You are speeding and your fine is $" + 270 + ".");
        }
        else if(result >= 31){
            System.out.println("You are speeding and your fine is $" + 500 + ".");
        }
    }
}
