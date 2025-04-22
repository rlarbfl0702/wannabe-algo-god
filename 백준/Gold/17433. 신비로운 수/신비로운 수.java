import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            // 입력받을 숫자의 개수
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 입력받을 숫자를 저장할 배열
            int arr[] = new int[N];

            // 입력받는 숫자가 모두 같은 숫자인지 판단할 변수
            // (입력받는 숫자가 모두 같은 숫자일 경우, 신비로운 수가 무한대로 발산하므로)
            boolean TF = true;

            for(int i = 0; i < N; i++){
                int n = Integer.parseInt(st.nextToken());

                arr[i] = n;

                // i가 0보다 크고 아직 TF가 true일 때
                if((i > 0) && TF){
                    // i - 1번째 입력값과 i번째 입력값이 다르다면
                    if(arr[i - 1] != arr[i]){
                        // 입력받는 숫자가 모두 같지 않다는 뜻이므로
                        // TF를 false 처리
                        TF = false;
                    }
                }
            }

            // 만약 입력받은 수가 1개라면
            // 그 또한 신비로운 수가 무한대로 증폭하므로 INFINITY를 결과값에 추가
            if(N == 1){
                sb.append("INFINITY" + "\n");
            }
            // TF가 true일 경우, 모든 수가 같아 신비로운 수가 무한대로 발산한다는 뜻이므로
            // INFINITY를 결과값에 추가
            else if(TF){
                sb.append("INFINITY" + "\n");
            }
            // 모두 같은 수가 아닐 경우
            else{
                // 배열을 오름차순으로 정렬
                Arrays.sort(arr);

                // 우선 첫번째 수와 두번째 수의 차이를 저장
                // 모든 수를 똑같은 수로 나눴을 때, 나머지가 다 같아야 하므로
                // 수들간의 차이의 최대공약수를 찾아야되기 때문
                int g = Math.abs(arr[0] - arr[1]);

                // 뒤에 수가 더 있다면 앞에서 계산했던 차이와
                // 현재 수와 이전수의 차이를 가지고
                // 최대공약수를 찾아냄
                for(int i = 2; i < N; i++){
                    g = gcd(g, Math.abs(arr[i] - arr[i - 1]));
                }

                // 최종적으로 찾은 최대공약수를 결과값에 추가
                sb.append(g + "\n");

            }
        }
        System.out.println(sb);
    }

    // 유클리드 호제법
    // 만약 b가 0이라면 b가 최대공약수이므로 b를 return
    // 만약 0이 아닐 경우, b를 a로 (a % b)한 값을 b로 다시 재귀함수를 돌림
    // EX) a = 5, b = 10일 경우, b == 10이므로 b 값이였던 10을 a로
    // (a % b)값이였던 5로 다시 재귀함수를 돌림
    // 이번에는 b == 5이므로 b 값이였던 5를 a로, (a % b)값인 5를 b로 재귀함수 돌림
    // 이번에도 b == 5이므로 b 값이였던 5를 a로, (a % b)값인 0을 b로 다시 함수 돌림
    // 이번에는 b == 0이므로 a였던 5를 return
    // 이로써 5와 10의 최대공약수는 5인 것을 알 수 있음
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}

