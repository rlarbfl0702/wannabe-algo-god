import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 소수인지 아닌지 boolean 값으로 저장
        boolean prime[] = new boolean[N + 1];

        // true 값이 소수 아닌 것
        // false 값이 소수 인것
        // 0과 1은 소수가 아니므로 true로 변환
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(N); i++){
            // i번째 수가 소수라면
            if(!prime[i]){
                // i의 배수는 다 i를 약수로 가지고 있으므로 true로 변환
                for(int j = i * i; j <= N; j = j + i){
                    prime[j] = true;
                }
            }
        }

        // M부터 N까지 소수인 것(boolean 값이 false인 것들)을 출력
        for(int i = M; i <= N; i++){
            if(!prime[i]){
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }
}
