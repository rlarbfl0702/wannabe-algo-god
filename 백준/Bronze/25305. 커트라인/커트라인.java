import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[10001];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[num]++;
        }
        
        for(int i=10000; i>=0; i--) {
            while(arr[i] > 0) {
                arr[i]--;
                k--;
            }
            if(k<=0) {
                System.out.println(i);
                break;
            }
        }
    }
}