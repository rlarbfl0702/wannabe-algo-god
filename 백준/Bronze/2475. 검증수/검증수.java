import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double sum = 0;

        int result = 0;

        for(int i = 0; i < 5; i++){
            double n = Integer.parseInt(st.nextToken());

            sum = sum + Math.pow(n, 2);
        }

        result = (int)(sum % 10);

        System.out.println(result);
    }
}
