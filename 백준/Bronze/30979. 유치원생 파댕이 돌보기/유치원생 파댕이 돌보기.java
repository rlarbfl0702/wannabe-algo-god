import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            result = result + n;
        }

        if(T > result){
            System.out.println("Padaeng_i Cry");
        }
        else{
            System.out.println("Padaeng_i Happy");
        }
    }
}
