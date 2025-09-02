import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int test = 0; test < N; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int T = Integer.parseInt(st.nextToken());
            // 점수 저장 배열
            int arr[] = new int[T];

            double sum = 0;
            // 평균이 넘는 학생 수
            double cnt = 0;

            for(int i = 0; i < T; i++){
                int n = Integer.parseInt(st.nextToken());

                arr[i] = n;

                sum = sum + n;
            }

            // 평균
            double avg = sum / T;

            for(int i = 0; i < T; i++){
                if(arr[i] > avg){
                    cnt = cnt + 1;
                }
            }

            double result = (cnt / T) * 100;
            sb.append(String.format("%.3f", result) + "%" + "\n");
        }

        System.out.println(sb);
    }
}
