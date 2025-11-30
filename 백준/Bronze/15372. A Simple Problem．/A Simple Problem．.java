import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            long N = Long.parseLong(br.readLine());

            sb.append((long) Math.pow(N, 2) + "\n");
        }

        System.out.println(sb);
    }
}
