import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] isNotPrime = new boolean[N + 1]; // 소수 판별 배열
        isNotPrime[0] = true; // 0은 소수가 아님
        isNotPrime[1] = true; // 1은 소수가 아님

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= N; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true; // 소수가 아닌 것들 체크
                }
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (!isNotPrime[i]) { // 소수라면
                sum += i;
                if (i < min) {
                    min = i; // 최솟값 갱신
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1); // 소수가 없을 경우
        } else {
            System.out.println(sum); // 소수의 합
            System.out.println(min); // 최솟값
        }
    }
}
