import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());

            double sum = 0.0;

            for(int j = 0; j < x; j++){
                st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                int quantity = Integer.parseInt(st.nextToken());
                double price = Double.parseDouble(st.nextToken());

                sum += quantity * price;
            }

            System.out.printf("$%.2f\n", sum);
        }
    }
}