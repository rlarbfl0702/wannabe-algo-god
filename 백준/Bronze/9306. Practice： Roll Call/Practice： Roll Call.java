import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            String s = br.readLine();
            String n = br.readLine();

            sb.append("Case " + i + ": " + n + ", " + s + "\n");
        }

        System.out.println(sb);
    }
}