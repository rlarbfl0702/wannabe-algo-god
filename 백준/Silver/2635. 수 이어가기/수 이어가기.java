import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 기준 숫자
        int N = Integer.parseInt(br.readLine());

        // 결과값
        int result = 0;
        // 만들 수 있는 숫자를 저장할 ArrayList
        ArrayList<Integer> resultArr = new ArrayList<>();

        for(int i = N; i > 0; i--){
            // a - b = c에서 a에 해당하는 초기값
            int num = N;
            // b에 해당하는 초기값
            int min = i;
            // 숫자를 저장할 ArrayList
            ArrayList<Integer> arr = new ArrayList<>();

            // 만들 수 있는 숫자 갯수를 세는 변수
            int cnt = 0;

            while(true){

                // 숫자가 음수가 되면 반복문 탈출
                if(num < 0){
                    break;
                }

                // 만든 숫자를 arrayList에 저장
                arr.add(num);

                // a - b = c 다음 계산에서
                // b가 a가 되고 c가 b가 되므로
                // b를 다른 변수에 따로 저장해놓고
                int m = min;

                // 다음 b에 들어갈 현재 c값을 계산
                min = num - min;

                // 그리고 다음 a에 들어갈 값을 현재 b값으로 갱신
                num = m;

                // 그리고 계산을 한번 했으므로 카운트
                cnt = cnt + 1;
            }

            // 만약 현재 계산값이 기존 값보다 크다면 결과 배열에 숫자를 저장 후,
            // 결과값 갱신
            if(result < cnt){
                resultArr = arr;

                result = cnt;
            }
        }

        System.out.println(result);

        for(int i : resultArr){
            System.out.print(i + " ");
        }
    }
}
