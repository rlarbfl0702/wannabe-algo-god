import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 점수 입력 받음
        int score[] = new int[N];
        // 정렬한 점수를 넣을 Deque
        ArrayDeque<Integer> solved = new ArrayDeque<>();

        // 점수를 입렫받음
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            score[i] = n;
        }

        // 점수를 정렬
        Arrays.sort(score);

        // 정렬한 점수를 Deque에 저장
        for(int i = 0; i < N; i++){
            solved.addLast(score[i]);
        }

        // 위 아래로 몇명 제외해야되는지 퍼센테이지 계산
        int cnt = (int)Math.round(N * 0.15);

        // 제외해야되는 사람이 0이 될 때까지 반복
        while(true){
            if(cnt == 0){
                break;
            }

            // 맨 위와 맨 밑의 점수를 제거
            solved.pollFirst();
            solved.pollLast();

            cnt = cnt - 1;
        }

        // 결과값 저장
        float result = 0;

        for(int i : solved){
            result = result + i;
        }

        // 평균값을 구함
        result = Math.round(result / solved.size());

        // int로 변환
        int avg = (int)result;

        System.out.println(avg);
    }
}
