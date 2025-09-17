import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int j = 1; j <= N; j++){

            for(int k = 0; k < N - j; k++){
                sb.append(" ");
            }

            for(int k = 0; k < 2 * j - 1; k++){
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
