import java.io.*;
import java.util.*;

// 에라토스테네스의 체를 사용
// 소수들을 대량으로 빠르고 정확하게 구하는 알고리즘

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 범위가 1000이므로
        boolean prime[] = new boolean[1001];

        // boolean 함수가 처음에 false로 초기화 되므로 true가 소수가 아닌 걸로 표시
        // 0과 1은 소수가 아니므로 반대로 바꿔줌
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(1000); i++){
            // i가 소수일 경우,
            if(!prime[i]){
                // i의 배수는 소수가 아니므로 boolean 값을 반대로 바꿔줌
                for(int j = i * i; j <= 1000; j = j + i){
                    prime[j] = true;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 소수인지 판별할 수 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());

            // false일 경우, 소수이므로 cnt + 1
            if(!prime[a]){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}