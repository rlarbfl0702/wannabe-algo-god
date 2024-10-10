import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] numArr = new int[n];

        for(int i=0; i<n; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);

        int x = Integer.parseInt(br.readLine());

        int answer = 0;
        int start = 0;
        int end = n-1;
        while(end > start) {
            int sum = numArr[start] + numArr[end];
            if(sum == x) {
                answer++;
            }
            if(sum<x) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println(answer);
    }
}