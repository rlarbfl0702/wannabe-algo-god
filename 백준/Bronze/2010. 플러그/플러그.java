import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = Integer.parseInt(br.readLine());

        for(int i = 1; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            result = result + n - 1;
        }

        System.out.println(result);
    }
}
