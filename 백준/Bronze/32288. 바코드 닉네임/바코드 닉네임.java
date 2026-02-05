import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'I') {
                sb.append("i");
            }
            else {
                sb.append("L");
            }
        }
        System.out.println(sb);
    }
}
