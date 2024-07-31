import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값
        int n = Integer.parseInt(br.readLine());

        // 제곱값의 개수를 저장할 배열
        int arr[] = new int[n + 1];

        // 배열의 i번째 값을 i값으로 저장
        // 최대 필요한 개수는 1의 제곱으로 다 채우는 경우이므로
        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        for(int i = 1; i <= n; i++){
            // 제곱수가 기존값보다 크면 안되므로 
            // j * j 가 i보다 작거나 같을때까지 반복
            for(int j = 1; j * j <= i; j++){
                // i번째 배열의 값을 i번째 배열의 값과
                // i번째 배열에서 j의 제곱값을 뺀 값에서 1 더한값 중
                // 더 작은 값을 저장
                arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
            }
        }

        System.out.println(arr[n]);
    }
}
