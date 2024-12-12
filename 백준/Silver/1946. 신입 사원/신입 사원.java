import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스크케이스 개수
        int T = Integer.parseInt(br.readLine());

        for(int testCase = 0; testCase < T; testCase++){
            // 지원자의 수
            int N = Integer.parseInt(br.readLine());

            // 점수 저장할 배열
            int score[][] = new int[N][2];

            // 결과값
            int result = 1;

            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                // 테스트 점수
                int t1 = Integer.parseInt(st.nextToken());
                int t2 = Integer.parseInt(st.nextToken());

                score[i][0] = t1;
                score[i][1] = t2;
            }

            // 시험 점수를 기준으로 정렬
            // 첫번째 시험 점수를 기준으로 정렬을 하고,
            // 만약 첫번째 시험 점수가 같다면 두번째 시험 점수를 기반으로 정렬
            // Integer.compare = a - b 랑 같음
            // 첫번째 점수, 두번째 점수 오름차순으로 정렬
             Arrays.sort(score, ((a, b) -> {
                if(a[0] != b[0]){
                    return Integer.compare(a[0], b[0]);
                }
                else{
                    return Integer.compare(a[1], b[1]);
                }
            }));

            int min = score[0][1];

            for(int i = 1; i < N; i++){

                int s2 = score[i][1];

                // 첫번째 점수가 기준 점수보다 크고
                // 두번째 점수가 기준 점수보다 작을 경우
                // 두 점수 모두 기준 점수보다 크면 기준점이 된 사원이
                // 입사할 수 없으므로 (사원끼리 점수를 비교했을 때 일방적으로
                // 두 점수 모두 작은 사람이 있으면 안된다고 했으므로)
                // 신입사원 수 + 1
                if(s2 < min){
                    result = result + 1;

                    // 두번째 기준 점수를 해당 사원의
                    // 두번째 점수로 교체
                    min = s2;

                }
            }

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}
