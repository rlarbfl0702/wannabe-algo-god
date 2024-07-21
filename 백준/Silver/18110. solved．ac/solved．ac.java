import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] scores = new int[31];

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int difficulty = Integer.parseInt(br.readLine());
            scores[difficulty]++;
        }

        int num = Math.round(n * 0.15f);
        int cnt = 0;
        int cnt2 = 0;
        int result = 0;
        for(int i=1; i<31; i++) {
            if(scores[i] > 0) {
                for(int j=0; j<scores[i]; j++) {
                    if(cnt >= num) {
                        if(cnt2 >= n-num) {
                            continue;
                        }
                        result += i;
                        cnt2++;
                        continue;
                    }
                    cnt2++;
                    cnt++;
                }
            }
        }
        System.out.println(Math.round((float) result /(n-num*2)));
    }
}
