import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N+1; i++) {
            int result = i;
            int num = i;
            while(num > 0) {
                result += num % 10;
                num /= 10;
            }
            if(result == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
