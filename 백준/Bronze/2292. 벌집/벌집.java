import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 입력값이 1일때, 자기 방이므로 지나가는 방 1개
        if(N == 1){
            System.out.println(1);
        }
        else{
            // 방 번호
            int r = 1;
            // 몇개의 방 지나가는지 카운트
            int cnt = 1;
            // 방의 개수가 6의 배수만큼 늘어나므로 배수를 처리할 변수
            int i = 1;

            while(true){
                // 한 둘레에 있는 방의 최대 번호 계산
                // 그전 최대 번호 + 6의 배수 만큼 늘어나는 방이므로 6 * i만큼 더해줌
                r = r + 6 * i;
                // 배수를 처리하기 위해서 + 1
                i = i + 1;
                // 한 바퀴를 돌때마다 지나가는 방이 한개 늘어나므로 + 1
                cnt = cnt + 1;

                // 만약 가야되는 방 번호가 한 둘레에 있는 방의 최대 번호보다 작다면 종료
                if(N <= r){
                    break;
                }
            }

            System.out.println(cnt);
        }
    }
}
