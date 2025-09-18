import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = cal(A, B);

            sb.append((A / result) * (B / result) * result + "\n");
        }

        System.out.println(sb);
    }

    public static int cal(int a, int b){
        if(a % b == 0){
            return b;
        }

        return cal(b, a % b);
    }
}
