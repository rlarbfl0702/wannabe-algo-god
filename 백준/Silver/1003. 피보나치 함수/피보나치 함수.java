import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[][] numArr = new int[41][2];

        numArr[0][0] = numArr[1][1] = 1;
        numArr[0][1] = numArr[1][0] = 0;

        for(int i=2; i<41; i++) {
            numArr[i][0] = numArr[i-1][0] + numArr[i-2][0];
            numArr[i][1] = numArr[i-1][1] + numArr[i-2][1];
        }

        int num = 0;
        for(int t=0; t<T; t++) {
            num = Integer.parseInt(br.readLine());
            sb.append(numArr[num][0]).append(' ').append(numArr[num][1]).append('\n');
        }

        System.out.println(sb);
    }
}