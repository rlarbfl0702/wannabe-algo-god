import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            double d = Double.parseDouble(br.readLine());

            if(d == - 1.0){
                break;
            }

            String d_f = String.format("%.2f", d);

            double result = d * 0.167;

            String result_f = String.format("%.2f", result);

            sb.append("Objects weighing " + d_f + " on Earth will weigh " + result_f + " on the moon." + "\n");
        }

        System.out.println(sb);
    }
}
