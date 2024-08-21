import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] times = new int[N][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            times[i][0] = Integer.parseInt(st.nextToken());
            times[i][1] = Integer.parseInt(st.nextToken());
        }

        if(N == 1) {
            System.out.println(1);
            return;
        }

        Arrays.sort(times, (n1, n2)-> {
            if(n1[1] == n2[1]) {
                return n1[0]-n2[0];
            }
            return n1[1]-n2[1];
        });

        int answer = 1;
        int start = times[0][1];

        for(int i=1; i<N; i++) {
            if(times[i][0] >= start) {
                answer++;
                start = times[i][1];
            }
        }
        System.out.println(answer);
    }
}