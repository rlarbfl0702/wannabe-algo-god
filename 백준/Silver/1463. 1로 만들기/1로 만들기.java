import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 연산 횟수 저장
        int arr[] = new int[N + 1];

        arr[1] = 0;

        if(N > 1){
            arr[2] = 1;
        }

        if(N > 2){
            arr[3] = 1;
        }

        for(int i = 4; i <= N; i++){
            // i번째 값을 전 배열 값에 1을 더한 값으로 저장
            arr[i] = arr[i - 1] + 1;

            // 3으로 나누어 떨어진다면
            if(i % 3 == 0){
                // 3으로 나눈 값에서 1을 더한 값과
                // 해당 값보다 1작은 값에서 1 더한 값 중
                // 더 작은 값을 해당 배열 값과 비교해 더 작은 값을 저장
                arr[i] = Math.min(Math.min(arr[i / 3] + 1, arr[i - 1] + 1), arr[i]);
            }

            // 2로 나누어 떨어진다면
            if(i % 2 == 0){
                // 2으로 나눈 값에서 1을 더한 값과
                // 해당 값보다 1작은 값에서 1 더한 값 중
                // 더 작은 값을 해당 배열 값과 비교해 더 작은 값을 저장
                arr[i] = Math.min(Math.min(arr[i / 2] + 1, arr[i - 1] + 1), arr[i]);
            }

        }

        System.out.println(arr[N]);
    }
}
