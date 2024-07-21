import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int MAX_SIZE = 1_000_001;
        boolean[] notPrimeNum = new boolean[MAX_SIZE];

        notPrimeNum[0] = true;
        notPrimeNum[1] = true;

        for(int i=2; i<MAX_SIZE; i++) {
            if(!notPrimeNum[i]) {
                for (int j = i * 2; j < MAX_SIZE; j += i) {
                    notPrimeNum[j] = true;
                }
            }
        }

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=M; i<N+1; i++) {
            if(!notPrimeNum[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
