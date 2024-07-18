import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 결과값 저장 변수
        int result = 0;

        while(true){
            // 만약 설탕이 5로 나누어 떨어진다면 
            if(N % 5 == 0){
                // 결과값은 기존 결과값 + 설탕을 5로 나눈 몫
                result = result + N / 5;
                // 반복문 종료
                break;
            }
            // 만약 나누어 떨어지지 않는다면
            else{
                // 설탕을 3키로 빼고
                N = N - 3;
                // 3키로 봉지를 하나 썼으므로 결과값 + 1
                result = result + 1;
            }

            // 만약 설탕의 무게가 마이너스가 된다면
            // 5와 3으로 정확하게 나누어지지 않는다는 뜻이므로
            if(N < 0){
                // 결과값을 -1로 저장하고 반복문 종료
                result = -1;
                break;
            }
        }

        System.out.println(result);
    }
}
