import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double total = 0;
        double sub_score = 0;

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            // 학점
            double N = Double.parseDouble(st.nextToken());
            // 과목 평점
            String M = st.nextToken();

            // 학점 * 과목 평점을 저장할 변수
            double score = 0;

            // 총 학점을 구하기 위한 학점 더하기
            sub_score = sub_score + N;

            if (M.equals("A+")) {
                score = N * 4.5;
            } else if (M.equals("A0")) {
                score = N * 4.0;
            } else if (M.equals("B+")) {
                score = N * 3.5;
            } else if (M.equals("B0")) {
                score = N * 3.0;
            } else if (M.equals("C+")) {
                score = N * 2.5;
            } else if (M.equals("C0")) {
                score = N * 2.0;
            } else if (M.equals("D+")) {
                score = N * 1.5;
            } else if (M.equals("D0")) {
                score = N * 1.0;
            } else if (M.equals("F")) {
                score = N * 0.0;
            }
            // Pass 과목이므로 계산에서 빼기 위해 총 학점에서 해당 학점 뺌
            else {
                sub_score = sub_score - N;
            }

            total = total + score;
        }

        double result = total / sub_score;

        System.out.println(result);
    }
}
