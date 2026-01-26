import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if((a1 == 0) && (a2 == 0) && (a3 == 0)){
                break;
            }

            int d1 = a2 - a1;
            int d2 = a3 - a2;

            if(d1 != d2){
                sb.append("GP " + (a3 * (a3 / a2) + "\n"));
            }
            else{
                sb.append("AP " + (a3 + d2) + "\n");
            }
        }

        System.out.println(sb);
    }
}
