import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            arr[i] = n;
        }

        int arr2[] = Arrays.stream(arr).distinct().toArray();

        Arrays.sort(arr2);

        int len = arr2.length;

        for(int i = 0; i < len; i++){
            sb.append(arr2[i] + "\n");
        }

        System.out.println(sb);
    }
}