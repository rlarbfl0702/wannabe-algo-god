import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }

        System.out.println(minNum + " " + maxNum);
    }
}