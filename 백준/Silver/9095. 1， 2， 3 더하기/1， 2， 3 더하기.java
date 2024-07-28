import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            int n = Integer.parseInt(br.readLine());

            // 배열에 합의 개수 저장
            int arr[] = new int[n + 1];

            // 배열의 초기값을 저장
            // 1은 1, 2는 2, 3은 4로 초기값 저장
            arr[1] = 1;

            if(n > 1){
                arr[2] = 2;
            }

            if(n > 2){
                arr[3] = 4;
            }

            // 4부터는 합의 개수가 i - 1, i - 2, i - 3번째 값을
            // 모두 더한 값
            for(int i = 4; i <= n; i++){
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }

            sb.append(arr[n] + "\n");
        }
        System.out.println(sb);
    }
}
