import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        final int MAX = 1_000_000;
        final int MAX_SIZE = 2_000_001;

        boolean[] numArr = new boolean[MAX_SIZE];
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            numArr[num+MAX] = true;
        }

        for(int i=0; i<MAX_SIZE; i++) {
            if(numArr[i]) {
                sb.append(i-MAX).append('\n');
            }
        }
        System.out.println(sb);
    }
}
