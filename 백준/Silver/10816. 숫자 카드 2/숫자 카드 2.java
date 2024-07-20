import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int MAX_SIZE = 20_000_001;
        int SIZE = 10_000_000;

        int[] numArr = new int[MAX_SIZE];

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            numArr[Integer.parseInt(st.nextToken()) + SIZE]++;
        }


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            sb.append(numArr[Integer.parseInt(st.nextToken()) + SIZE]).append(' ');
        }
        System.out.println(sb);
    }
}
