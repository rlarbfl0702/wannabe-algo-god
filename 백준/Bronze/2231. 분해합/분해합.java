import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 생성자를 찾을 자연수
        int N = Integer.parseInt(br.readLine());

        // 0부터 N까지 각 자연수의 분해합을 구하여 N과 일치하면 종료
        for(int i = 1; i <= N; i++){
            int M = i;
            int result = i;

            while(true){
                // 분해합을 하는 과정
                // 원래 수에 각 자리수를 더하는 과정
                result = result + (M % 10);

                // 일의 자리부터 더하기 때문에 더하고 나서 해당 자리 수를 없애줌
                M = M / 10;

                // 만약 모든 자리 수를 더해 나누고 난 후의 몫이 0이라면 종료
                if(M == 0){
                    break;
                }
            }

            if(result == N){
                System.out.println(i);
                break;
            }

            if(i == N){
                System.out.println(0);
            }
        }
    }
}
