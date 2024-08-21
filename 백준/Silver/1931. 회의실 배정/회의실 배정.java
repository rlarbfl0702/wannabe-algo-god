import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 회의실 개수
        int N = Integer.parseInt(br.readLine());

        // 회의실 시간 저장할 배열
        int office[][] = new int[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 시작시간과 끝시간 배열에 저장
            office[i][0] = a;
            office[i][1] = b;
        }

        // 오름차순으로 정렬
        Arrays.sort(office, (n1, n2) -> {
            // 끝나는 시간을 기준으로 정렬 만약 비교하는 두 값이 같다면
            // 시작시간을 기준으로 정렬
            if((n1[1] - n2[1]) == 0){
                return n1[0] - n2[0];
            }

            return n1[1] - n2[1];
        });

        // 회의실 카운트
        int cnt = 0;
        // 끝나는 시간 계산할 때 쓸 변수
        int last_time = 0;

        for(int i = 0; i < N; i++){
            // 만약 해당 회의실 시작시간이 앞에 계산된 끝난 시간보다
            // 같거나 크다면
            if(office[i][0] >= last_time){
                // 회의실 + 1
                cnt = cnt + 1;
                // 끝난 시간을 해당 회의실 끝나는 시간으로 갱신
                last_time = office[i][1];
            }
        }

        System.out.println(cnt);
    }
}
