import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = 0;
        int T = 0;

        for(int i = 0; i < 4; i++){
            int n = Integer.parseInt(st.nextToken());

            S = S + n;
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++){
            int m = Integer.parseInt(st2.nextToken());

            T = T + m;
        }

        if(S >= T){
            System.out.println(S);
        }
        else{
            System.out.println(T);
        }
    }
}
