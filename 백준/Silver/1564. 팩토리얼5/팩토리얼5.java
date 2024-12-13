import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 결과값
        long pec = 1;
        // 2의 갯수
        int cnt2 = 0;
        // 5의 갯수
        int cnt5 = 0;

        // 펙토리얼 계산
        for(int i = 1; i <= N; i++){

            int n = i;

            // 펙토리얼을 계산하는 숫자에
            // 2의 갯수가 몇개인지 카운트
            if(i % 2 == 0){
                while(true){
                    if(n % 2 == 0){
                        n = n / 2;

                        cnt2 = cnt2 + 1;
                    }
                    else{
                        break;
                    }
                }
            }


            // 펙토리얼을 계산하는 숫자에
            // 5의 갯수가 몇개인지 카운트
            if(i % 5 == 0){
                while(true){
                    if(n % 5 == 0){
                        n = n / 5;

                        cnt5 = cnt5 + 1;
                    }
                    else{
                        break;
                    }
                }
            }

            // 펙토리얼을 계산
            // 2와 5로 나눈 몫을 곱하고 100000을 나눈 나머지를 저장
            // (overflow를 막기 위해 나눔)
            pec = (pec * n) % 100000;

        }

        // 2와 5를 곱해야 10이 되는데, 5의 갯수보다 2의 갯수가 더 많으므로
        // 그 차이만큼 2를 다시 곱해줌
        int diff = cnt2 - cnt5;

        for(int i = 0; i < diff; i++){
            pec = (pec * 2) % 100000;
        }

        // 결과값
        String result = Long.toString(pec);

        // 5자리보다 작다면 앞을 0으로 채워 5자리를 맞춰줌
        while (result.length() < 5) {
            result = "0" + result;
        }


        System.out.println(result);
    }
}
