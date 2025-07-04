import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());

        for(int i = 0; i < test; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j = 0; j < n; j++){
                sb.append(s);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
