import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 직사각형 가로 길이
        int n = Integer.parseInt(br.readLine());

        // 직사각형을 채우는 방법의 수를 저장할 배열
        int sqr[] = new int[n + 1];

        // 직사각형의 가로 길이가 1일 때, 채우는 방법의 개수가 1이고
        // 가로 길이가 2일 때, 채우는 방법의 개수가 3이므로
        // 배열의 1번째 값을 1로, 2번째 값을 3으로 초기화
        sqr[1] = 1;

        if(n > 1){
            sqr[2] = 3;
        }

        // 3부터 n까지 반복
        for(int i = 3; i <= n; i++){
            // 가로가 i인 직사각형을 채우는 방법의 수는
            // 가로가 i - 1인 직사각형을 채우는 방법의 수와
            // 가로가 i - 2인 직사각형을 채우는 방법의 수에 2를 곱한 값을 더한 값과
            // 같기 때문에 두 값을 더해준 뒤 10007로 나눈 나머지 값을 구함
            sqr[i] = (sqr[i - 1] + 2*sqr[i - 2]) % 10007;
        }

        System.out.println(sqr[n]);
    }
}
