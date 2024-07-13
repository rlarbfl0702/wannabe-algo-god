import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 수 입력할 배열
        int arr[] = new int[10001];

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            arr[n] = arr[n] + 1;
        }

        int cnt = 0;

        for(int i = 1; i < 10001; i++){
            if(arr[i] != 0){
                for(int j = 0; j < arr[i]; j++){
                    sb.append(i).append('\n');
                    cnt = cnt + 1;
                }
            }

            if(cnt == N){
                break;
            }
        }
        System.out.println(sb);
    }
}
