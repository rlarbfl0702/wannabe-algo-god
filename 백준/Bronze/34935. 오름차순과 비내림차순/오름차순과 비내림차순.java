import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long tmp = 0;
        int answer = 1;

        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(st.nextToken());
            if(i != 0) {
                if(n <= tmp) {
                    answer = 0;
                    break;
                }
            }
            tmp = n;
        }
        System.out.println(answer);
    }
}