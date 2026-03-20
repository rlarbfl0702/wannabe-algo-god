import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int G = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            int km = 0;
            
            if(G == 1){
                km = 1;
            }
            else if(G == 2){
                km = 3;
            }
            else if(G == 3){
                km = 5;
            }
            
            if(C >= E){
                sb.append(0 + "\n");
            }
            else{
                sb.append((E - C) * km + "\n");
            }
        }

        System.out.println(sb);
    }
}