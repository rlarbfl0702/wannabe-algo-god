import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받는 숫자의 개수
        int N = Integer.parseInt(br.readLine());

        // 평균 계산할 변수
        double avg = 0;

        // 최댓값, 최솟값 계산을 위한 변수
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 중앙값을 찾을 때 쓰는 변수
        int mid = 0;

        // 최빈값을 찾을 때 쓰는 변수
        int value = 0;

        // 최빈값을 찾기 위한 배열
        int arr[] = new int[8001];

        // 산술평균 결과값
        int result1 = 0;
        // 중앙값 결과값
        int result2 = 0;
        // 최빈값 결과값
        int result3 = 0;
        // 범위 결과값
        int result4 = 0;

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            // 평균 값을 계산하기 위해 더해줌
            avg = avg + n;

            // 배열의 해당 값 위치에 + 1
            // 절댓값 4000이라고 했으므로 마이너스도 올 수 있으니 +4000을 해줌
            arr[n + 4000] = arr[n + 4000] + 1;

            // 입력들어오는 값이 현재 최솟값보다 작다면 갱신
            if(min > n){
                min = n;
            }

            // 입력들어오는 값이 현재 최댓값보다 크다면 갱신
            if(max < n){
                max = n;
            }
        }

        // 몇개째인지 세기위한 변수
        int cnt = 0;

        // 최빈값이 같을 경우, 제일 작은 수인지 판별하기 위해서
        boolean TF = false;

        // 중앙값과 최빈값을 찾기 위한 반복문
        for(int i = 0; i < 8001; i++){
            // 만약 1보다 크다면 입력이 됐었다는 의미므로
            // 입력된 횟수만큼 카운트
            if(arr[i] >= 1){
                // 입력된 횟수만큼 반복문을 돌면서
                for(int j = 0; j < arr[i]; j++){
                    // 1씩 카운트에 더해주고
                    cnt = cnt + 1;

                    // 만약 카운트가 전체 개수를 2로 나눈것에서 1을 더한 값과
                    // 같다면 중앙값이므로 중앙값 갱신
                    // 처음 저장할때 마이너스를 고려해서 + 4000을 해줬으므로 -4000을 해줌
                    if(cnt == ((N / 2) + 1)){
                        mid = i - 4000;
                    }
                }

                // 만약 기존 최빈값보다 더 개수가 크다면
                if(value < arr[i]){
                    // 최빈값의 개수를 갱신하고
                    value = arr[i];

                    // 해당하는 최빈값을 결과값에 저장
                    result3 = i - 4000;

                    TF = false;
                }
                // 만약 기존 최빈값과 개수가 같다면
                else if(value == arr[i]){
                    // 여러개의 최빈값들 중 최솟값인지 판단해야함
                    // 만약 변수가 false라면 아직 첫번째 값이라는 의미므로
                    // 현재 값이 두번째로 작은 수가 됨 따라서 TF를 true로 바꾸고
                    // 최빈값 갱신
                    if(!TF){
                        // 해당하는 최빈값을 결과값에 저장
                        result3 = i - 4000;

                        TF = true;
                    }
                }
            }

            // 입력된 횟수만큼 모든 숫자를 찾았으면 반복문 종료
            if(cnt == N){
                break;
            }
        }

        result1 = (int)Math.round(avg / N);
        result2 = mid;
        result4 = max - min;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
