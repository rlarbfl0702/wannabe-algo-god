import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 중복해서 수가 들어오지 않는다고 했으므로 boolean으로 관리
        // 절댓값이 1,000,000보다 작거나 같은 정수라고 했으므로 크기를 2,000,001로 잡음
        boolean arr[] = new boolean[2000001];

        // 입력된 수에 해당하면 배열값을 true로 변환
        // -도 포함이지만 배열은 무조건 0부터 시작하므로 1,000,000을 더한 곳에 해당 값을 저장함
        for(int i = 1; i <= N; i++){
            int n = Integer.parseInt(br.readLine());

            arr[n + 1000000] = true;
        }

        // 몇개가 저장되는지 카운트
        int cnt = 0;

        // 1부터 2000000까지 true인 값을 저장
        // 카운트 값이 입력된 숫자의 수와 같다면 종료
        for(int i = 0; i < 2000001; i++){
            if(arr[i] == true){
                sb.append((i - 1000000)+ "\n");
                cnt = cnt + 1;
            }

            if(cnt == N){
                break;
            }
        }

        System.out.println(sb);
    }
}
