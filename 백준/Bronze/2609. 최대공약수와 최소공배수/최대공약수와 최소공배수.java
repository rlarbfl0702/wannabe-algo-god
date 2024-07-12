import java.io.*;
import java.util.*;

// 유클리드 호제법
// a,b에 대해서 a를 b로 나눈 나머지를 r이라 한다면 a,b의 최대공약수와 b,r의 최대공약수는 같다.
// 따라서 a를 b로 나눈 나머지 r을 구하고, b를 r로 나눈 나머지 r'을 구한다.
// 나머지가 0이 될때 나눈 수가 a,b의 최대공약수가 된다.
// 해당 방법으로 구한 최대공약수를 활용하여 최소 공배수는 (a * b)/최대 공약수 식으로 구할 수 있다.

public class Main {

    static int gcd = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 최소공배수와 최대공약수를 구할 두 수
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        GCD(N1, N2);

        // 유클리드 호제법 식을 활용한 최소공배수 구하는 식
        int lcm = (N1 * N2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    // 최대공약수를 구할 함수
    public static void GCD(int n1, int n2){
        // n1이 n2로 나누어 떨어진다면 n2가 두 수의 최대공약수이므로
        // 최대공약수는 n2고 함수 종료
        if(n1 % n2 == 0){
            gcd = n2;
            return;
        }

        // 만약 나누어떨어지지 않는다면 유클리드 호제법을 이용해서 n2와 n1을 n2로 나눈 나머지로
        // 함수를 다시 돌림
        GCD(n2, n1 % n2);
    }
}
