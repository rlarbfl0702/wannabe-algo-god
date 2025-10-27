import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();

            int strategy = Integer.parseInt(st.nextToken());
            int it = Integer.parseInt(st.nextToken());
            int technology = Integer.parseInt(st.nextToken());

            int total = strategy + it + technology;

            double st_p = 35.0 * 30 / 100;
            double it_p = 25.0 * 30 / 100;
            double tec_p = 40.0 * 30 / 100;

            if((strategy >= st_p) && (it >= it_p) && (technology >= tec_p)){
                if(total >= 55){
                    sb.append(name + " " + total + " " + "PASS" + "\n");
                }
                else{
                    sb.append(name + " " + total + " " + "FAIL" + "\n");
                }
            }
            else{
                sb.append(name + " " + total + " " + "FAIL" + "\n");
            }
        }

        System.out.println(sb);
    }
}