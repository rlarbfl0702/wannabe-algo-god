import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());

            int cnt = 0;
            int result = 0;

            while(true){
                result = (cnt * cnt) + cnt;

                if(result > N){
                    sb.append(cnt - 1 + "\n");

                    break;
                }

                cnt = cnt + 1;

            }
        }

        System.out.println(sb);
    }
}
