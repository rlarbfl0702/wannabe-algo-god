import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            arr[i] = n;
        }

        Arrays.sort(arr);

        for(int i = N - 1; i >= 0; i--){
            sb.append(arr[i] + "\n");
        }

        System.out.println(sb);
    }
}
