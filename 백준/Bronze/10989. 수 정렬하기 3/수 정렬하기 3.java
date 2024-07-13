import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numArr = new int[10_001];
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            numArr[num]++;
        }

        for(int i=1; i<10_001; i++) {
            int cnt = numArr[i];
            for(int j=0; j<cnt; j++) {
                numArr[i]--;
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
