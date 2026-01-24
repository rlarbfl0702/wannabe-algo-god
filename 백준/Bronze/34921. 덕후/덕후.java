import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int answer = Math.max(0, (25-A+T)*2 + 10);

        System.out.println(answer);
    }
}