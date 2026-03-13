import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int s_h = Integer.parseInt(st.nextToken());
            int s_m = Integer.parseInt(st.nextToken());
            int s_s = Integer.parseInt(st.nextToken());

            int f_h = Integer.parseInt(st.nextToken());
            int f_m = Integer.parseInt(st.nextToken());
            int f_s = Integer.parseInt(st.nextToken());

            int time = (f_h * 3600 + f_m * 60 + f_s) - (s_h * 3600 + s_m * 60 + s_s);

            sb.append(time / 3600 + " ");

            time = time % 3600;

            sb.append(time / 60 + " ");
            sb.append(time % 60 + " ");

            sb.append("\n");
        }

        System.out.println(sb);
    }
}