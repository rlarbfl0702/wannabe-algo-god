import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n_h = Integer.parseInt(st.nextToken());
        int f_h = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while(true){

            if(n_h >= f_h){
                break;
            }

            n_h = n_h + g;

            cnt = cnt + 1;
        }

        System.out.println(cnt);
    }
}
