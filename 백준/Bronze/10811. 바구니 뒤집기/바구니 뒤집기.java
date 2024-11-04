import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N + 1];

        for(int i = 0; i < N + 1; i++){
            arr[i] = i;
        }

        for(int test = 0; test < M; test++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st2.nextToken());
            int f = Integer.parseInt(st2.nextToken());

            for(int i = 0; i <= (f - s)/2; i++){
                int num1 = arr[s + i];
                arr[s + i] = arr[f - i];
                arr[f - i] = num1;
            }
        }

        for(int i = 1; i <= N; i++){
            sb.append(arr[i] + " ");
        }

        System.out.println(sb);
    }
}