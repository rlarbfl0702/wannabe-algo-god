import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[] nonePrimeArr = new boolean[1001];
        nonePrimeArr[0] = true;
        nonePrimeArr[1] = true;
        for(int i=2; i<1001; i++) {
            if(!nonePrimeArr[i]) {
                for (int j=i*2; j<1001; j+=i) {
                    nonePrimeArr[j] = true;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int answer = 0;
        for(int i=0; i<N; i++) {
            if (!nonePrimeArr[Integer.parseInt(st.nextToken())]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
