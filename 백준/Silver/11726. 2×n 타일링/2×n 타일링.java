import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 타일의 가로 길이
        int n = Integer.parseInt(br.readLine());

        // 직사각형을 채우는 방법의 개수를 저장할 배열
        int sqr[] = new int[n + 1];

        // 가로가 1일 때 방법의 개수는 1, 가로가 2일때 방법의 개수는 2이므로
        // 배열 1번째 값은 1, 배열 2번째 값은 2로 초기화
        sqr[1] = 1;

        if(n > 1){
            sqr[2] = 2;
        }

        // 3번째부터 n번까지 반복
        for(int i = 3; i <= n; i++){
            // 가로의 길이가 i일때 방법의 개수는
            // 가로의 길이 i - 1일때 방법의 개수와 i - 2일때 방법의 개수 합과
            // 같으므로 두 값을 더해준 뒤 10007로 나눈 나머지 값을 구함
            sqr[i] = (sqr[i - 1] + sqr[i - 2])%10007;
        }

        System.out.println(sqr[n]);
    }
}
