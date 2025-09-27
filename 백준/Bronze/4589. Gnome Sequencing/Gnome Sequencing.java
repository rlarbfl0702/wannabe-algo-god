import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        sb.append("Gnomes:").append('\n');

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a>=b && b >= c) {
                sb.append("Ordered").append('\n');
            }
            else if(a <= b && b <= c) {
                sb.append("Ordered").append('\n');
            }
            else {
                sb.append("Unordered").append('\n');
            }
        }
        System.out.println(sb);
    }
}
