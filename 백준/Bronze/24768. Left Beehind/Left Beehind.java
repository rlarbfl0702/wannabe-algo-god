import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());

            if((N1 == 0) && (N2 == 0)){
                break;
            }

            if((N1 + N2) == 13){
                sb.append("Never speak again." + "\n");
            }
            else if(N1 > N2){
                sb.append("To the convention." + "\n");
            }
            else if(N1 < N2){
                sb.append("Left beehind." + "\n");
            }
            else if(N1 == N2){
                sb.append("Undecided." + "\n");
            }
        }

        System.out.println(sb);
    }
}
