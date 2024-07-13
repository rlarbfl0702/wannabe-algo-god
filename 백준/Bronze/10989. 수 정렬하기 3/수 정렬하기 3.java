import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 수 입력할 배열
        int arr[] = new int[10001];

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            // 수가 입력되면 그 수번째 배열을 카운트 + 1
            arr[n] = arr[n] + 1;
        }

        // 몇개 출력되었는지 카운트할 변수
        int cnt = 0;

        // 수의 범위가 1부터 10000까지므로
        for(int i = 1; i < 10001; i++){
            // arr의 i번째가 0이 아니라면 입력이 된 수이기 때문에
            if(arr[i] != 0){
                // 입력된 횟수만큼
                for(int j = 0; j < arr[i]; j++){
                    // 해당 숫자를 저장
                    sb.append(i + "\n");
                    // 출력 카운트 + 1
                    cnt = cnt + 1;
                }
            }

            // 만약 출력 카운트가 몇개 입력되었는지 알려주는 N과 같다면 반복문 종료
            if(cnt == N){
                break;
            }
        }

        System.out.println(sb);
    }
}
