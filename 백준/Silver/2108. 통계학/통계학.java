import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int MAX_SIZE = 8_001;
        int[] numArr = new int[MAX_SIZE];

        int N = Integer.parseInt(br.readLine());

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int mostVal = 0;

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            numArr[num+4000]++;
            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);
            mostVal = Math.max(mostVal, numArr[num + 4000]);
        }

        int leftCnt = 0;
        int cnt = N/2+1;
        int mid = 0;
        double sum = 0;

        int most = 0;
        int mostCnt = 0;
        for(int i=0; i<MAX_SIZE; i++) {
            if(numArr[i] > 0) {
                if(numArr[i] == mostVal) {
                    if(mostCnt < 2) {
                        most = i-4000;
                        mostCnt++;
                    }
                }
                for(int j=0; j<numArr[i]; j++) {
                    sum += i-4000;
                    leftCnt++;
                    if(leftCnt == cnt) {
                        mid = i-4000;
                    }
                }
            }
        }
        sb.append(Math.round(sum / N))
                .append('\n')
                .append(mid)
                .append('\n')
                .append(most)
                .append('\n')
                .append(maxVal - minVal)
                .append('\n');

        System.out.println(sb);
    }
}
