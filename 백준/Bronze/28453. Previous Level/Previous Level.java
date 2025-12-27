import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            if(n == 300){
                sb.append(1 + " ");
            }
            else if(n >= 275 && n < 300){
                sb.append(2 + " ");
            }
            else if(n >= 250 && n < 275){
                sb.append(3 + " ");
            }
            else if(n < 250){
                sb.append(4 + " ");
            }
        }

        System.out.println(sb);

    }
}