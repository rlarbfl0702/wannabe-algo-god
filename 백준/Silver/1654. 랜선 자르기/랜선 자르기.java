import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lengths = new int[K];

        long left = 1;
        long right = Integer.MIN_VALUE;

        for(int i=0; i<K; i++) {
            lengths[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, lengths[i]);
        }

        while(left <= right) {
            long mid = left + (right - left) / 2;
            int cnt = 0;

            for(int i=0; i<K; i++) {
                cnt += lengths[i]/mid;
            }

            if(cnt >= N) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }

        System.out.println(right);
    }
}