import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 1;

        for(int i = N; i > 0; i--){
            result = result * i;
        }

        result = result % 10;

        System.out.println(result);
    }
}
