import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 식을 입력받는 변수
        String math = br.readLine();

        // "-"로 식들을 구별
        String no_minus[] = math.split("-");

        // 결과값을 저장할 변수
        int result = 0;

        // "-"로 구분된 식들의 개수만큼 반복
        for(int i = 0; i < no_minus.length; i++){
            // 처음 부분은 "-"가 앞에 없으므로 그냥 더해줘도 됨
            if(i == 0){
                // +로 구분하여 숫자를 저장할때, 그냥 "+"로 하면 에러가 나서
                // "\\+"로 적어줌
                String number[] = no_minus[0].split("\\+");
                // 저장된 식에서 숫자들만 남았으므로
                for(String s : number){
                    int n = Integer.parseInt(s);

                    // 그 숫자들을 더해줌
                    result = result + n;
                }
            }
            // 앞에 "-"가 있는 식은
            else{
                String number[] = no_minus[i].split("\\+");
                // 값을 더할 변수
                int sum = 0;

                // 저장된 식에서 숫자들만 남았으므로
                for(String s : number){
                    int n = Integer.parseInt(s);

                    // 그 숫자들을 더해줌
                    sum = sum + n;
                }

                result = result - sum;
            }
        }

        System.out.println(result);
    }
}
