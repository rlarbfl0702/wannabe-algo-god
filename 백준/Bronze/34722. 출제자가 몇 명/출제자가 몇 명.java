import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int BOJ = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int ICPC = Integer.parseInt(st.nextToken());

            if(BOJ >= 1000){
                cnt = cnt + 1;
            }
            else if(C >= 1600){
                cnt = cnt + 1;
            }
            else if(A >= 1500){

                cnt = cnt + 1;
            }
            else if(ICPC >= 0 && ICPC <= 30){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}