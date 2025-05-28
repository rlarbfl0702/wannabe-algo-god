import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int arr[];
    public static int result[];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            arr[i] = n;
        }

        Arrays.sort(arr);

        DFS(0, 0, M);

        System.out.println(sb);
    }

    public static void DFS(int s, int n, int d){
        if(n == d){
            for(int i : result){
                sb.append(i + " ");

            }

            sb.append("\n");

            return;
        }

        for(int i = s; i < N; i++){
            result[n] = arr[i];

            DFS(i + 1, n + 1, d);
        }
    }
}
