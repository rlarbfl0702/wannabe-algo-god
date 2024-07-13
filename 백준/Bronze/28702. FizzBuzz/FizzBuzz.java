import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 결과값인 숫자를 저장할 변수
        int result = 0;
        // 결과값을 출력할 변수
        String out = "";

        // Fizz와 Buzz와 FizzBuzz가 연속해서 3개가 올 수 없으므로 
        // 입력 3개중 숫자를 찾을 경우 몇번째 입력 수인지에 따라 
        // 결과 숫자를 구함
        for(int i = 0; i < 3; i++){
            String s = br.readLine();
            int n = 0;

            // 입력받은 문자열의 앞글자를 떼서 아스키코드로 비교해봤을때,
            // 대문자가 아니라면 숫자이므로
            if(s.charAt(0) < 65){
                // 숫자로 변환해준뒤 몇번째 입력숫자인지에 따라 
                // 몇번째 뒤에 결과값이 나오는지 달라지므로 
                // 그에 맞게 결과값을 계산해줌
                n = Integer.parseInt(s);
                result = n + (3 - i);
            }
        }

        // 결과값이 3과 5로 나눴을때, 둘다 나머지가 0이라면
        if((result % 3 == 0) && (result % 5 == 0)){
            // 출력 결과물을 FizzBuzz로 저장
            out = "FizzBuzz";
        }

        // 3으로 나눴을 때, 나머지는 0이지만 5로 나눴을 때 0이 아니라면
        if((result % 3 == 0) && (result % 5 != 0)){
            // 출력 결과물을 Fizz로 저장
            out = "Fizz";
        }

        // 3으로 나눴을 때 0이 아니지만 5로 나눴을 때, 나머지가 0이라면
        if((result % 3 != 0) && (result % 5 == 0)){
            // 출력 결과물을 Buzz로 저장
            out = "Buzz";
        }

        // 3과 5로 나눴을때, 나머지가 둘다 0이 아니라면
        if((result % 3 != 0) && (result % 5 != 0)){
            // 출력 결과물을 숫자로 저장
            out = result + "";
        }

        System.out.println(out);
    }
}
