import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            br.readLine();
            for (int n = 0; n < N; n++) {
                br.readLine();
            }
            sb.append("Material Management ").append(t + 1).append("\n").append("Classification ---- End!\n");
        }

        System.out.println(sb);
    }
}