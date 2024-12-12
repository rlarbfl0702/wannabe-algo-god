import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수열의 길이
        int N = Integer.parseInt(st.nextToken());
        // 같은 원소 제한 갯수
        int K = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            arr[i] = n;
        }

        // 결과값
        int result = 0;

        // 시작점
        int start = 0;
        // 끝점
        int finish = 0;

        // 숫자의 개수를 저장할 배열
        int cntArr[] = new int[100001];

        // 끝점이 N보다 커지기 전까지 반복
        while(finish < N){

            // 끝점에 해당하는 숫자의 갯수를 + 1
            cntArr[arr[finish]] = cntArr[arr[finish]] + 1;

            // 끝점에 해당하는 숫자의 갯수가 K가 넘어가면 while문을 돌림
            while(cntArr[arr[finish]] > K){
                // 숫자의 갯수가 K를 넘어갔으므로
                // 시작점이 되는 숫자의 갯수를 - 1 해주고
                cntArr[arr[start]] = cntArr[arr[start]] - 1;

                // 시작점을 늘림
                start = start + 1;
            }

            // 끝점에서 시작점을 뺀 값과 현재 결과값 중 더 큰 값을
            // 결과값으로 갱신
            result = Math.max(result, finish - start + 1);

            // 시작점을 1칸 늘림
            finish = finish + 1;
        }

        System.out.println(result);
    }
}
