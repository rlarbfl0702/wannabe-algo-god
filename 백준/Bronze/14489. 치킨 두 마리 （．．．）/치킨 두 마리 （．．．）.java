import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger C = new BigInteger(br.readLine());
        BigInteger n = new BigInteger("2");

        BigInteger C2 = C.multiply(n);

        // A와 B를 더한 값과 C를 2곱한 값을 비교해서
        // 결과값이 1이나 0이 나오면 A와 B를 더한 값이
        // C를 2 곱한 값보다 크거나 같다는 뜻이므로
        // 두 값을 더한 값에서 치킨 두마리 뺀 값을 출력하고
        // 결과값이 -1이 나오면 치킨 두마리 값이 더 크다는 뜻이므로
        // 두 통장에 들어있는 돈의 합을 출력
        int result = (A.add(B)).compareTo(C2);

        if(result >= 0){
            System.out.println((A.add(B)).subtract(C2));
        }
        else{
            System.out.println(A.add(B));
        }
    }
}
