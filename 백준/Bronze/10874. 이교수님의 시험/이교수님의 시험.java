import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 1; j <= 10; j++){
                int N = Integer.parseInt(st.nextToken());

                if((((j - 1) % 5) + 1) == N){
                    if(j == 10){
                        sb.append(i + "\n");
                    }
                }
                else{
                    break;
                }
            }
        }

        System.out.println(sb);
    }
 }