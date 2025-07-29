import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A, B 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // K, X 입력 받기
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st2.nextToken());
        int X = Integer.parseInt(st2.nextToken());

        // K를 중심으로 한 범위
        int low = K - X;
        int high = K + X;

        // 교집합 범위 계산
        int from = Math.max(A, low);
        int to = Math.min(B, high);

        if (from > to) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(to - from + 1);
        }
    }
}
