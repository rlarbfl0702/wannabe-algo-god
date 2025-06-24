import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            double d1 = Double.parseDouble(st.nextToken());
            double d2 = Double.parseDouble(st.nextToken());

            if((d1 == 0) && (d2 == 0)){
                sb.append("AXIS" + "\n");
                break;
            }

            if((d1 == 0) || (d2 == 0)){
                sb.append("AXIS" + "\n");
            }
            else if((d1 > 0) && (d2 > 0)){
                sb.append("Q1" + "\n");
            }
            else if((d1 < 0) && (d2 > 0)){
                sb.append("Q2" + "\n");
            }
            else if((d1 < 0) && (d2 < 0)){
                sb.append("Q3" + "\n");
            }
            else if((d1 > 0) && (d2 < 0)){
                sb.append("Q4" + "\n");
            }
        }

        System.out.println(sb);
    }
}
