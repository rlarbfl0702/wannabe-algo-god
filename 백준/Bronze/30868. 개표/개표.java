import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n / 5; j++) {
                sb.append("++++").append(' ');
            }
            for (int j = 0; j < n % 5; j++) {
                sb.append('|');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}