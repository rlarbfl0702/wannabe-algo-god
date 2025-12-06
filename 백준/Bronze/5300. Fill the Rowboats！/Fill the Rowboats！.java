import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int cnt = 1;

        while(true){
            if(cnt > N){
                if(N % 6 != 0){
                    sb.append("Go! ");
                }

                break;
            }

            if(cnt % 6 == 0){
                sb.append(cnt + " " + "Go! ");
            }
            else{
                sb.append(cnt + " ");
            }

            cnt = cnt + 1;
        }

        System.out.println(sb);
    }
}
