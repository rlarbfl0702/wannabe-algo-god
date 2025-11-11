import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 5; i++){
            int N = Integer.parseInt(st.nextToken());

            if(N == T){
                result = result + 1;
            }
        }

        System.out.println(result);
    }
}