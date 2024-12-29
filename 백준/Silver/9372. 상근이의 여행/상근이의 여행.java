import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 갯수
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 국가의 수
            int N = Integer.parseInt(st.nextToken());
            // 비행기의 종류
            int M = Integer.parseInt(st.nextToken());

            // 결과는 항상 N - 1
            sb.append(N - 1).append("\n");

            // 간선 정보 입력은 무시
            for (int i = 0; i < M; i++) {
                br.readLine();
            }
        }

        System.out.println(sb);
    }
}
