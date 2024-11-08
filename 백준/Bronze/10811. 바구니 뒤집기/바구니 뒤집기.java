import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            for(int j=0; j<(b-a)/2+1; j++) {
                int tmp = arr[a+j];
                arr[a+j] = arr[b-j];
                arr[b-j] = tmp;
            }
        }
        for(int i=0; i<N; i++) {
            sb.append(arr[i]).append(' ');
        }
        sb.append('\n');
        System.out.println(sb);
    }
}