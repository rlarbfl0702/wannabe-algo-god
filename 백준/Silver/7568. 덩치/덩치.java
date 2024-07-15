import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] info = new int[N*2];
        int[] rank = new int[N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            info[i*2] = Integer.parseInt(st.nextToken());
            info[i*2+1] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++) {
            rank[i] = 1;
            for(int j=0; j<N; j++) {
                if(i == j) {
                    continue;
                }
                if(info[i*2] < info[j*2] && info[i*2+1] < info[j*2+1]) {
                    rank[i]++;
                }
            }
            sb.append(rank[i]).append(' ');
        }
        System.out.println(sb);
    }
}
