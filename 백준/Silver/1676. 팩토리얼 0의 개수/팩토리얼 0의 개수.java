import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 뒤에 0이 올려면 곱했을 때 10이 나와야 되는데 10의 개수는
        // 5의 개수로 판별이 되므로 5의 배수가 몇번 나오는지 카운트
        // 5를 곱했을 때 10이 되려면 2도 있어야 되지만
        // 2의 배수가 5의 배수보다 훨씬 많으므로 5의 배수만 신경쓰면 됨
        int five = 0;

        // N이 0일 때, 무조건 출력이 0이므로 0 출력
        if(N == 0){
            System.out.println(0);
        }
        else{
            for(int i = 1; i <= N; i++){
                // i가 0이면 나머지가 0이 나오므로 0을 제외하고 5로 나눴을 때 0일 경우,
                if(i % 5 == 0){
                    // i를 직접적으로 건드리면 무한루프에 빠지므로 따로 변수에 i값을 저장해줌
                    int num = i;

                    // 기존 5를 카운트 하는 변수에 i를 5로 먗반 나눌 수 있는지 더함
                    while(true){
                        // i를 5로 계속 나눌 수 있을 경우
                        if(num != 0 && num % 5 == 0){
                            num = num / 5;
                            five = five + 1;
                        }
                        // 5로 계속 나눌 수 없을 경우
                        else{
                            break;
                        }
                    }
                }
            }

            System.out.println(five);
        }
    }
}
