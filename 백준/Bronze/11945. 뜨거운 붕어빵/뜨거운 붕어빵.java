import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            for(int j = M - 1; j >= 0; j--){
                sb.append(s.split("")[j]);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}