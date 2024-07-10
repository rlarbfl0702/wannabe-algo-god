import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    // 카드 합이 중복될 수 있으므로 중복값이 들어가지 않는 set을 사용
    static Set<Integer> cards_sum = new HashSet<>();
    static int cards_num[];
    static int N;
    static int arr[] = new int[3];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 카드의 개수
        N = Integer.parseInt(st.nextToken());
        // 만들어야되는 최대한 가까운 수
        int M = Integer.parseInt(st.nextToken());
        // 결과값
        int result = 0;

        // 카드 숫자 저장할 배열
        cards_num = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int c = Integer.parseInt(st2.nextToken());

            // 카드 번호 저장
            cards_num[i] = c;
        }

        cards(0, 0);

        // 차이 최솟값을 찾기 위한 변수
        int min = Integer.MAX_VALUE;

        // set에는 순서가 없으므로 다시 배열로 전환
        int sumArr[] = new int[cards_sum.size()];

        int idx = 0;

        // 배열로 전환
        for(int i : cards_sum){
            sumArr[idx] = i;
            idx = idx + 1;
        }

        // 조합하여 합을 구한 카드 값 배열에서 가장 근접한 값 찾기 위해 반복
        for(int i = 0; i < sumArr.length; i++){
            // M을 넘지 않아야 하므로
            if(M >= sumArr[i]){
                if(min > (M - sumArr[i])){
                    result = sumArr[i];

                    min = M - sumArr[i];
                }
            }
        }

        System.out.println(result);
    }

    public static void cards(int n, int m){
        // 카드 세개가 조합이 됐을 경우,
        if(n == 3){
            // 해당 카드 3개의 숫자를 더함
            cards_sum.add(arr[0] + arr[1] + arr[2]);
        }
        else{
            // 중복된 값이 들어가지 않기 위해 i = m
            for(int i = m; i < N; i++){
                // 카드 3개를 조합하는 배열에 카드 한개를 넣음
                arr[n] = cards_num[i];
                // 한개가 들어갔으므로 깊이 + 1
                n = n + 1;
                // 선택한 다음카드부터 조합에 사용하기 위해서 + 1
                // 다음 카드 조합하러감
                cards(n, i + 1);
                // 다른 카드도 조합하기 위해서 깊이 초기화
                n = n - 1;
            }
        }
    }
}
