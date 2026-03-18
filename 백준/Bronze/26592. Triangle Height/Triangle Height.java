import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());

            double h = (a * 2) / b;

            sb.append("The height of the triangle is " + String.format("%.2f", h) + " units" + "\n");
        }

        System.out.println(sb);
    }
}