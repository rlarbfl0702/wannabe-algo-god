import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i = 0; i < N; i++){

            int n = Integer.parseInt(br.readLine());

            result = result + n;
        }

        System.out.println(result);
    }
}
