import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 동전의 개수
        int N = Integer.parseInt(st.nextToken());

        // 만들어야되는 금액
        int K = Integer.parseInt(st.nextToken());

        // 동전 가치 저장할 배열
        int coins[] = new int[N];

        // 값을 입력받아 배열에 저장
        for(int i = 0; i < N; i++){
            int c = Integer.parseInt(br.readLine());

            coins[i] = c;
        }

        // 동전 개수
        int cnt = 0;

        for(int i = N - 1; i >= 0; i--){
            // 만약 해당 코인 가치가 만들어야되는 금액보다 작다면
            if(coins[i] <= K){
                // 남은 만들어야되는 금액을 코인 가치로 나눈 몫을
                // 코인 개수에 더함
                cnt = cnt + (K / coins[i]);

                // 남은 금액을 해당 코인 가치로 나눈 나머지로 갱신함
                K = K % coins[i];
            }

            // 만약 남은 금액이 0이 되면 반복문 종료
            if(K == 0){
                break;
            }
        }

        System.out.println(cnt);
    }
}
