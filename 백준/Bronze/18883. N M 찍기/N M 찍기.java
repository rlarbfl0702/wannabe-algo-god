import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 1;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(j == M - 1){
                    sb.append(cnt);
                }
                else{
                    sb.append(cnt + " ");
                }

                cnt = cnt + 1;
            }

            if(i != N - 1){
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
 }