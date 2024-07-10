import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int diff = M;
        for(int i=0; i<N-2; i++) {
            for(int j=i+1; j<N-1; j++) {
                for(int k=j+1; k<N; k++) {
                    int sum = cards[i]+cards[j]+cards[k];
                    if(sum == M) {
                        answer = sum;
                        System.out.println(answer);
                        return;
                    }
                    if(sum < M) {
                        if(M - sum < diff) {
                            answer = sum;
                            diff = M-sum;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
