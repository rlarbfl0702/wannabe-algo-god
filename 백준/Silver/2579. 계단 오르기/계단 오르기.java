import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 계단 점수 저장 배열
        int stairs[] = new int[N + 1];

        // 계단의 점수들을 더한 배열
        int scores[] = new int[N + 1];

        for(int i = 1; i <= N; i++){
            int s = Integer.parseInt(br.readLine());

            // 계단 점수 저장
            stairs[i] = s;
        }

        // 계단이 한개일 때, 계단 한개의 점수만 더하면됨
        if(N == 1){
            scores[1] = stairs[1];
        }
        // 계단이 두개일 때, 계단 두개의 점수만 더하면됨
        else if(N == 2){
            scores[2] = stairs[1] + stairs[2];
        }
        // 계단이 3개 이상일 경우,
        else{
            // 1번째 계단까지 최고 점수는 1번 계단 점수만
            scores[1] = stairs[1];
            // 2번째 계단까지 최고 점수는 1번 계단 + 2번 계단 점수
            scores[2] = stairs[1] + stairs[2];
            // 3번째 계단까지 최고 점수는 3개의 계단을 연속해서 밟으면 안되므로
            // 1번 + 3번과 2번 + 3번 중 더 큰 값으로 저장
            scores[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);

            // 4번째 계단부터 N번째 계단까지 반복
            for(int i = 4; i < N + 1; i++){
                // 끝에 계단은 무조건 밝아야됨
                // 현재 계단을 기준으로 연속 두칸으로 밟을지 한칸으로 밟을지에 따라 비교
                // 현재 계단을 기준으로 연속해서 두칸을 밟는다면
                // i번째 계단 + i-1번째 계단에 i-3번째 계단까지의 최대값을 더한 값,
                // 현재 계단을 기준으로 연속해서 한칸을 밟는다면
                // i번째 계단 + i-2번째 계단까지의 최대값을 더한 값이 나오는데
                // 위 값들을 비교해서 더 큰 값을 해당 i번째 계단까지의 최대값에 저장
                scores[i] = Math.max(scores[i - 3] + stairs[i - 1] + stairs[i], scores[i - 2] + stairs[i]);
            }
        }

        System.out.println(scores[N]);
    }
}
