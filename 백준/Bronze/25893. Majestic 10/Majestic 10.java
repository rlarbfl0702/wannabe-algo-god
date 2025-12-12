import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int test = 0; test < N; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int cnt = 0;

            if(A >= 10){
                cnt = cnt + 1;
            }

            if(B >= 10){
                cnt = cnt + 1;
            }

            if(C >= 10){
                cnt = cnt + 1;
            }

            if(cnt == 0){
                sb.append(A + " " + B + " " + C + "\n");
                sb.append("zilch" + "\n");
                sb.append("\n");
            }
            else if(cnt == 1){
                sb.append(A + " " + B + " " + C + "\n");
                sb.append("double" + "\n");
                sb.append("\n");
            }
            else if(cnt == 2){
                sb.append(A + " " + B + " " + C + "\n");
                sb.append("double-double" + "\n");
                sb.append("\n");
            }
            else if(cnt == 3){
                sb.append(A + " " + B + " " + C + "\n");
                sb.append("triple-double" + "\n");
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }
}