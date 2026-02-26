import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int S_b = 0;
        int M_b = 0;
        int L_b = 0;

        int S = 0;
        int M = 0;
        int L = 0;

        int cnt = 0;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String size = st.nextToken();
            int p = Integer.parseInt(st.nextToken());

            if(size.equals("S")){
                S_b = S_b + 1;
                S = S + p;
            }
            else if(size.equals("M")){
                M_b = M_b + 1;
                M = M + p;
            }
            else if(size.equals("L")){
                L_b = L_b + 1;
                L = L + p;
            }
        }

        if(L != 0){
            L_b = L_b - (L / 12);

            if(L % 12 != 0){
                cnt = cnt + 1;
            }

            cnt = cnt + L / 12;
        }

        if(M != 0){
            M_b = M_b - (L / 8);

            if(M % 8 != 0){
                cnt = cnt + 1;
            }

            cnt = cnt + M / 8;
        }

        if(S != 0){
            S_b = S_b - (L / 6);

            if(S % 6 != 0){
                cnt = cnt + 1;
            }

            cnt = cnt + S / 6;
        }

        System.out.println(cnt);
    }
}