import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 점수 저장할 배열
        int scores[] = new int[N];

        // 시험 점수 최댓값 저장할 변수
        int max_score = Integer.MIN_VALUE;

        // 점수를 입력받으면서 최댓값을 찾고 배열에 저장
        for(int i = 0; i < N; i++){
            int s = Integer.parseInt(st.nextToken());

            if(s > max_score){
                max_score = s;
            }

            scores[i] = s;
        }

        double result = 0;

        // 최댓값으로 시험점수 다시 계산 후 다 더하기
        for(int i = 0; i < N; i++){
            result = result + (((double)scores[i]/max_score) * 100);
        }

        // 과목수만큼 나눠서 평균값 계산
        result = (double)result / N;

        System.out.println(result);
    }
}
