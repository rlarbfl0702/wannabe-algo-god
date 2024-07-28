import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            int N = Integer.parseInt(br.readLine());

            // 파도반 수열을 저장할 배열
            long tri[] = new long[N + 1];

            // 파도반 수열의 1번부터 3번까지는 모두 값이 1이기 때문에
            // 1, 2, 3번째 배열을 1로 초기화
            tri[1] = 1;

            if(N > 1){
                tri[2] = 1;
            }

            if(N > 2){
                tri[3] = 1;
            }

            // 4부터 N까지 반복
            for(int i = 4; i <= N; i++){
                // i번째 파도반 수열은 i-2번째와 i-3번째 수열 값을 합한 값
                tri[i] = tri[i - 2] + tri[i - 3];
            }

            sb.append(tri[N] + "\n");
        }
        System.out.println(sb);
    }
}
