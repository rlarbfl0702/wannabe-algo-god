import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        for(int i = 0; i < S - 1; i++) {
            sb.append(str.split("")[i]);
        }

        for(int i = F - 1; i > S - 2; i--){
            sb.append(str.split("")[i]);
        }

        for(int i = F; i < N; i++){
            sb.append(str.split("")[i]);
        }

        System.out.println(sb);
    }
}