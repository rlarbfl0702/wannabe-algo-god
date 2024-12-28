import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.MAX_VALUE;
        int M = Integer.MAX_VALUE;

        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if((N == 0) && (M == 0)){
                break;
            }

            if(N > M){
                sb.append("Yes" + "\n");
            }
            else{
                sb.append("No" + "\n");
            }
        }

        System.out.println(sb);
    }
}
