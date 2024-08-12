import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] trees = new long[N];

        long left = 1;
        long right = -1;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, trees[i]);
        }

        while(right >= left) {
            long mid = (right+left)/2;
            long total = 0;
            for(long tree: trees) {
                if(tree-mid > 0) {
                    total += tree-mid;
                }
            }
            if(total >= M) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}