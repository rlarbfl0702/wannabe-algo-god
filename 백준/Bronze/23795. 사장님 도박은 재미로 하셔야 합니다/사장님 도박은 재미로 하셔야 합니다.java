import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == -1){
                break;
            }

            result = result + n;
        }

        System.out.println(result);
    }
}
