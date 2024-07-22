import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 사람들의 키와 무게를 저장할 배열
        int people[][] = new int[N][2];
        int rank[] = new int[N];

        // 사람수만큼 반복
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            // 배열에 값 저장
            people[i][0] = w;
            people[i][1] = h;

        }

        for(int i = 0; i < N; i++){
            // 자기보다 높은게 몇개 있는지 세는 변수
            int cnt = 1;

            for(int j = 0; j < N; j++){
                // 기준 몸무게와 키를 비교했을 때, 모두 큰 사람이 있다면
                if((people[i][0] < people[j][0]) && people[i][1] < people[j][1]){
                    // 카운트 + 1
                    cnt = cnt + 1;
                }
            }

            // 랭크 배열에 위로 몇명있는지 기록
            rank[i] = cnt;
        }

        for(int i = 0; i < N; i++){
            System.out.print(rank[i] + " ");
        }
    }
}
