import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 동전 종류 갯수
        int n = Integer.parseInt(st.nextToken());

        // 동전 가치의 합 기준
        int k = Integer.parseInt(st.nextToken());

        // 동전 가치를 저장할 배열
        int coin[] = new int[n];
        // 최솟값을 저장할 배열
        int min[] = new int[k + 1];

        // 배열의 값을 integer 최댓값으로 채움
        Arrays.fill(min, Integer.MAX_VALUE);
        // 0원을 만드는데 필요한 동전의 갯수는 0개
        min[0] = 0;

        for(int i = 0; i < n; i++){
            int value = Integer.parseInt(br.readLine());
            // 배열에 가치 저장
            coin[i] = value;
        }

        for(int i = 0; i < n; i++){
            // 동전의 가치를 시작점으로 반복
            for(int j = coin[i]; j <= k; j++){
                // 만약 j가치에서 동전의 가치만큼 뺀 값이
                // 초기에 저장했던 MAX_VALUE가 아니라면
                // j가격을 만드는데 필요한 최솟값을 저장하는 배열의 값을
                // 현재의 값과 (j-현재 동전의 가치)번째의 배열값에서 1더한 값중
                // 더 작은 값을 재저장
                // ex) 처음에 0 위치만 0으로 초기화 되어있음 -> coin[0]값이 1이라 가정
                // -> 그러면 처음 반복문을 돌때 j와 coin[i]값은 같으므로 if문을 통과
                // 그럼 j값은 coin[0]값이 1이므로 min[1] = min[1]과 min[1 - 1] + 1깂 중
                // 더 작은 값을 저장 -> min[1]은 아직 MAX_VALUE이므로 min[0] + 1인 1을 min[1]에
                // 저장, 그러면 해당 계산을 완료하면 min[0], min[1]이 값이 생김 ->
                // 위 방법으로 해당 금액을 만드는 최솟값을 계속 갱신시킴
                if(min[j - coin[i]] != Integer.MAX_VALUE){
                    min[j] = Math.min(min[j], min[j - coin[i]] + 1);
                }
            }
        }

        // 만약 k를 만드는 최솟값이 MAX_VALUE일 경우,
        // 해당 동전 가치로 k를 못만든다는 뜻이므로 -1 출력
        if(min[k] == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        // 만약 아니라면 k를 만드는 최솟값이 저장되어 있는
        // min[k]값을 출력
        else{
            System.out.println(min[k]);
        }
    }
}
