import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while((s = br.readLine()) != null){
            if (s.trim().isEmpty()) {
                break; // 빈 줄은 건너뜀
            }

            StringTokenizer st = new StringTokenizer(s);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B + "\n");
        }

        System.out.println(sb);
    }
}