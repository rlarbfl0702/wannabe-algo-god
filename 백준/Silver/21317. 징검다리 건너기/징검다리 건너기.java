import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 돌의 갯수
        int N = Integer.parseInt(br.readLine());

        // 에너지 저장할 배열
        int energy[][] = new int[N - 1][2];

        // 돌까지 가는 최소 에너지를 저장할 배열
        int min[] = new int[N];

        // 초기값을 최대값으로 설정
        Arrays.fill(min, Integer.MAX_VALUE);
        min[0] = 0;

        for(int i = 0; i < N - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int s_e = Integer.parseInt(st.nextToken());
            int b_e = Integer.parseInt(st.nextToken());

            // 에너지 값 저장
            energy[i][0] = s_e;
            energy[i][1] = b_e;
        }

        // 매우 큰 점프를 하기 위해 필요한 에너지
        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < N - 1; i++){

            // 작은 점프 (i -> i+1)
            min[i + 1] = Math.min(min[i + 1], min[i] + energy[i][0]);

            // 큰 점프 (i -> i+2), 단, N-1을 넘지 않도록 함
            if (i + 2 < N) {
                min[i + 2] = Math.min(min[i + 2], min[i] + energy[i][1]);
            }
        }

        int result = min[N - 1]; // 매우 큰 점프를 사용하지 않았을 때의 최소 에너지

        // 매우 큰 점프는 i번째 돌에서 i+3번째 돌로 이동할 수 있음
        for (int i = 0; i < N - 3; i++) {

            // i에서 매우 큰 점프 사용 (i -> i+3)
            int tempMin[] = min.clone();
            tempMin[i + 3] = Math.min(tempMin[i + 3], min[i] + K);

            // 매우 큰 점프 이후의 경로를 다시 계산
            for (int j = i + 3; j < N - 1; j++) {
                tempMin[j + 1] = Math.min(tempMin[j + 1], tempMin[j] + energy[j][0]); // 작은 점프

                if (j + 2 < N) {
                    tempMin[j + 2] = Math.min(tempMin[j + 2], tempMin[j] + energy[j][1]); // 큰 점프
                }
            }

            // 매우 큰 점프를 사용한 경우와 사용하지 않은 경우의 최소값을 비교
            result = Math.min(result, tempMin[N - 1]);
        }

        // 결과 출력 (마지막 돌에 도달하는 최소 에너지)
        System.out.println(result);
    }
}
