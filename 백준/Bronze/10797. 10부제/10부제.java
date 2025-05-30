import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;

        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(st.nextToken());

            if(N == n){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}
