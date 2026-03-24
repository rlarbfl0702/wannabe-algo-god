import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            arr[i] = n;
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int m = Integer.parseInt(st2.nextToken());

            if(m >= arr[i]){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}