import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 현재 시각 입력
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 시
        int B = Integer.parseInt(st.nextToken()); // 분
        int C = Integer.parseInt(st.nextToken()); // 초

        // 추가할 시간(초)
        int D = Integer.parseInt(br.readLine());

        // 1. 초에 먼저 더하기
        C += D;

        // 2. 초 → 분으로 넘기기
        if (C >= 60) {
            B += C / 60;   // 몫만큼 분 증가
            C = C % 60;    // 나머지는 초
        }

        // 3. 분 → 시로 넘기기
        if (B >= 60) {
            A += B / 60;   // 몫만큼 시 증가
            B = B % 60;    // 나머지는 분
        }

        // 4. 시는 24시간 기준
        if (A >= 24) {
            A = A % 24;
        }

        // 결과 출력
        System.out.println(A + " " + B + " " + C);
    }
}