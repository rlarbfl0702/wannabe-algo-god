import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int result = N + M * 7;

        if(result > 30){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
