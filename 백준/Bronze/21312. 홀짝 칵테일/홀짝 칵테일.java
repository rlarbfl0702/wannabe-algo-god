import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 만들 수 있는 모든 경우 저장
        int arr[] = new int[7];

        arr[0] = A;
        arr[1] = B;
        arr[2] = C;
        arr[3] = A * B;
        arr[4] = A * C;
        arr[5] = B * C;
        arr[6] = A * B * C;

        int maxOdd = 0;
        int maxEven = 0;

        // 모든 경우 확인
        for(int i = 0; i < 7; i++) {

            if(arr[i] % 2 == 1) {
                // 홀수라면
                if(arr[i] > maxOdd) {
                    maxOdd = arr[i];
                }
            }
            else {
                // 짝수라면
                if(arr[i] > maxEven) {
                    maxEven = arr[i];
                }
            }
        }

        // 홀수가 하나라도 있으면 홀수 중 최대 출력
        if(maxOdd > 0) {
            System.out.println(maxOdd);
        }
        else {
            // 홀수가 없으면 짝수 중 최대 출력
            System.out.println(maxEven);
        }
    }
}