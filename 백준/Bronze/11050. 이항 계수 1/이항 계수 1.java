import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 조합을 구할때 N! / (K! * (N-K)!)이므로
        int K2 = N - K;
        // 결과값 저장할 변수
        int result = 1;
        // 팩토리얼 곱한 값 구할 변수
        int mul = 1;

        // 조합을 구할때 나누는 것이 K!과 (N-K)!이므로 더 큰쪽을 기준으로
        if(K >= K2){
            // 팩토리얼이 1부터 해당 수까지 모두 곱하는 것이기 때문에
            // 어차피 나눠야 될 수라면 처음부터 안곱하도록
            // 더 큰수보다 큰수부터 N까지 곱해서 저장
            for(int i = (K + 1); i <= N; i++){
                result = result * i;
            }

            // 나머지 작은 값을 팩토리얼 계산해줌
            for(int i = 1; i <= K2; i++){
                mul = mul * i;
            }

            // 위에 곱한수를 작은 값을 팩토리얼 계산한 값으로 나눠줌
            result = result / mul;
        }

        // 위와 같은 방식
        if(K2 > K){
            for(int i = (K2 + 1); i <= N; i++){
                result = result * i;
            }

            for(int i = 1; i <= K; i++){
                mul = mul * i;
            }

            result = result / mul;
        }

        System.out.println(result);
    }
}
