import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());

            if(N == 1){
                sb.append(1 + "\n");
            }
            else if(N == 2){
                sb.append(2 + "\n");
            }
            else if(N == 3){
                sb.append(6 + "\n");
            }
            else if(N == 4){
                sb.append(4 + "\n");
            }
            else{
                sb.append(0 + "\n");
            }
        }

        System.out.println(sb);
    }
}