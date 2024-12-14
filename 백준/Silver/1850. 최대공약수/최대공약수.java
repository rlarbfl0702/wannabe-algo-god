import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static BigInteger gcd = BigInteger.ZERO;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫번째 수의 1 갯수
        BigInteger A = new BigInteger(st.nextToken());
        // 두번째 수의 1 갯수
        BigInteger B = new BigInteger(st.nextToken());

        GCD(A, B);

        // 구한 두 숫자의 최대공약수만큼 1이 필요하므로
        // 최대공약수의 수만큼 1출력
        for(int i = 0; i < gcd.intValue(); i++){
            sb.append(1);
        }

        System.out.println(sb);
    }

    // 최대공약수 구하는 함수
    public static void GCD(BigInteger n1, BigInteger n2){
        // 유클리드 호제법
        // n1이 n2로 나누어 떨어진다면, n2가 두 수의 최대공약수 이므로
        // 최대공약수는 n2
        if(n1.mod(n2).equals(BigInteger.ZERO)){
            gcd = n2;

            return;
        }

        //만약 n1이 n2로 나누어 떨어지지 않는다면,
        // n1을 n2로 나눈 나머지를 n2로, n2를 n1으로 하여 다시
        // 최대공약수를 구해봄
        GCD(n2, n1.mod(n2));
    }
}
