import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int cnt = 1;

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int max = Math.max(A, Math.max(B, C));

            if(max == A){
                if(max * max == (B * B + C * C)){
                    sb.append("Scenario #" + cnt + ":" + "\n");
                    sb.append("yes" + "\n");
                }
                else{
                    sb.append("Scenario #" + cnt + ":" + "\n");
                    sb.append("no" + "\n");
                }
            }
            else if(max == B){
                if(max * max == (A * A + C * C)){
                    sb.append("Scenario #" + cnt + ":" + "\n");
                    sb.append("yes" + "\n");
                }
                else{
                    sb.append("Scenario #" + cnt + ":" + "\n");
                    sb.append("no" + "\n");
                }
            }
            else if(max == C){
                if(max * max == (A * A + B * B)){
                    sb.append("Scenario #" + cnt + ":" + "\n");
                    sb.append("yes" + "\n");
                }
                else{
                    sb.append("Scenario #" + cnt + ":" + "\n");
                    sb.append("no" + "\n");
                }
            }

            sb.append("\n");
            cnt = cnt + 1;
        }

        System.out.println(sb);
    }
}
