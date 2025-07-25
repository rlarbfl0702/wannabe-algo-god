import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int test = Integer.parseInt(br.readLine());

        for(int i = 0; i < test; i++){
            int money = Integer.parseInt(br.readLine());

            int min = 0;
            int total = 0;

            if(money > 1000){
                min = money - 1000;

                total = (1000 * N) + (min * M);
            }
            else{

                total = (money * N);
            }

            sb.append(money + " " + total + "\n");
        }

        System.out.println(sb);
    }
}
