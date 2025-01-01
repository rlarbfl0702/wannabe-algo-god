import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());

        long result = 0;

        if(N <= M){
            result = Math.abs(N - M);
        }
        else{
            result = Math.abs(M - N);
        }

        System.out.println(result);
    }
}
