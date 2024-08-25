import java.io.*;
import java.util.*;

public class Main {

    static int gcd;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 연도 기준
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            // 카잉 달력으로 구할 해
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 최대공약수를 저장할 변수
            gcd = 0;
            // 최대공약수 구하기
            GCD(M, N);

            // 최소공배수를 저장할 변수
            int lcm = 0;
            // 최소공배수 구하기
            lcm = (M * N)/gcd;

            // 결과값 저장 변수
            // 해당되는 카잉 달력 년도가 없다면 -1을 출력해야되므로
            // -1로 초기화
            int result = -1;

            // x값을 기준으로 최소공배수 전까지 반복
            // i값은 x값으로 시작해서 M값만큼 계속 증가시킴
            // 최소공배수와 x, y값이 모두 같을 경우 해당 반복문을
            // 진행하지 못하므로 x, y값에 -1처리하고 돌림
            for(int i = (x - 1); i < lcm; i = i + M){
                // i값을 N으로 나눴을때, 나머지 값이 y값으로 나온다면
                if(i % N == (y - 1)){
                    // result값을 i로 저장하고
                    // 위에서 x, y값에 -1을 했으므로 + 1을 해줌
                    // 반복문 종료
                    result = i + 1;
                    break;
                }
            }

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }

    public static void GCD(int n1, int n2){
        // n1이 n2로 나누어 떨어진다면 n2가 두 수의 최대공약수이므로
        // 최대공약수는 n2고 함수 종료
        if(n1 % n2 == 0){
            gcd = n2;
            return;
        }

        // 만약 나누어떨어지지 않는다면 유클리드 호제법을 이용해서
        // n2와 n1을 n2로 나눈 나머지로
        // 함수를 다시 돌림
        GCD(n2, n1 % n2);
    }
}
