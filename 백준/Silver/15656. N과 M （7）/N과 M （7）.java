import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int arr[];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            arr[i] = n;
        }

        // 오름차순 정렬해야되므로 정렬
        Arrays.sort(arr);

        int arr2[] = new int[M];

        DFS(0, M, arr2);

        System.out.println(sb);
    }

    public static void DFS(int n, int d, int num[]){
        if(n == d){
            for(int i : num){
                sb.append(i + " ");
            }

            sb.append("\n");

            return;
        }

        for(int i = 0; i < N; i++){
            num[n] = arr[i];

            DFS(n + 1, d, num);
        }
    }
}
