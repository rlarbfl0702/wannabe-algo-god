import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int result = N + M;

        if(result > 12){
            System.out.println(result % 12 == 0 ? 12 : result % 12);
        }
        else{
            System.out.println(result);
        }
    }
}
