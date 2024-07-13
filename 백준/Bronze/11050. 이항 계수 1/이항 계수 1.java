import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = 1;
        for(int i=K+1; i<N+1; i++) {
            answer *= i;
        }
        for(int i=1; i<N-K+1; i++) {
            answer /= i;
        }
        System.out.println(answer);
    }
}
