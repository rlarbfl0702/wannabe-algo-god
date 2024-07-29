import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N];
        sum[0] = arr[0];
        for(int i=1; i<N; i++) {
            sum[i] = sum[i-1] + arr[i];
        }

        int n1 = 0;
        int n2 = 0;
        int result = 0;
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            if(n1-2<0) {
                result = sum[n2-1];
            }
            else {
                result = sum[n2-1] - sum[n1-2];
            }
            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
}