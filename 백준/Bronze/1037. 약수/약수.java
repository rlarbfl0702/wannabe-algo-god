import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < cnt; i++) {
            int x = Integer.parseInt(st.nextToken());

            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }

        long answer;

        if (cnt == 1) {
            answer = 1L * min * min;
        } else {
            answer = 1L * min * max;
        }

        System.out.println(answer);
    }
}
