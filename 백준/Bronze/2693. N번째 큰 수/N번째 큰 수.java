import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int test = 0; test < N; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int arr[] = new int[10];

            for(int i = 0; i < 10; i++){
                int n = Integer.parseInt(st.nextToken());

                arr[i] = n;
            }

            Arrays.sort(arr);

            sb.append(arr[7] + "\n");
        }

        System.out.println(sb);
    }
}
