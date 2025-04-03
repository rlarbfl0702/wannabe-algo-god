import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        // 리모콘이 0 - 9 까지 있으므로 크기를 10으로 초기화
        // 고장난 번호는 false로 변환
        boolean num[] = new boolean[10];

        // 처음에는 번호가 모두 작동한다는 뜻으로 true로 저장
        Arrays.fill(num, true);

        // 고장난 번호가 0개일 수도 있으므로
        if(M > 0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            for(int i = 0; i < M; i++){
                int n = Integer.parseInt(st.nextToken());

                // 입력받은 번호를 고장 처리
                num[n] = false;
            }   
        }

        // 결과값을 우선 +, - 로만 이동하는 횟수로 저장
        // 현재 채널이 100이므로 이동해야될 채널에서 100을 뺀 수
        int result = Math.abs(N - 100);

        for(int i = 0; i <= 999999; i++){
            // i를 리모컨으로 누를 수 있는지 체크
            int cnt = canPress(i, num);

            // 만약 i가 리모컨으로 누를 수 있는 숫자라면
            if(cnt > 0){
                // i를 리모컨으로 누른 횟수와
                // i에서 N까지 +, -로 이동하는 횟수를 더함
                int len = cnt + Math.abs(N - i);

                // 위에 계산한 횟수와 원래 결과값을 비교해서
                // 최솟값을 다시 결과값에 저장
                result = Math.min(result, len);
            }
        }

        System.out.println(result);
    }

    public static int canPress(int n, boolean arr[]){
        // 숫자가 0일 경우
        if(n == 0){
            // 0을 누를 수 있으면 1을 반환하고
            // 없으면 0을 반환함
            return arr[0] ? 1 : 0;
        }

        int len = 0;

        // 숫자가 0보다 클 경우, 계속 반복
        while(n > 0){
            // 해당 자릿수의 숫자가 누를 수 없는 숫자일 경우
            if(!arr[n % 10]){
                // 0을 반환
                return 0;
            }

            // 해당 숫자는 이미 눌렀으므로
            // 해당 숫자를 제외하여 다시 숫자를 저장
            n = n / 10;

            // 해당 자릿수는 누를 수 있으므로 횟수 + 1
            len = len + 1;
        }

        // 해당 숫자를 누를 때 필요한 횟수를 반환
        return len;
    }
}
