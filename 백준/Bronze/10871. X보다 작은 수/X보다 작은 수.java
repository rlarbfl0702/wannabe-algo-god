import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        int X = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        
        for(int i = 0; i < N; i++){
            if(X > arr[i]){
                sb.append(arr[i] + " ");
            }
        }

        System.out.println(sb);
    }
}