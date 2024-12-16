import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력
        String s = br.readLine();

        // 괄호를 저장할 stack
        Stack<Character> cal = new Stack<>();

        // 최종 결과를 계산할 변수
        int result = 0;
        // 중간에 계산한 값을 저장할 변수
        int mid = 1;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            // 만약 문자가 '('라면 소괄호가 열리는 것이므로
            // stack에 ( 를 넣고, ()가 될 수도 있으므로
            // 중간 결과값에 2를 곱함 -> ex - (())이면 2 * 2이므로
            if(c == '('){
                cal.push(c);

                mid = mid * 2;
            }
            // 문자가 ')'이라면 소괋호가 닫히는 것
            else if(c == ')'){
                // 만약 stack이 비어있다면 괄호의 순서가 잘못되었다는 뜻이고
                // stack의 맨 위에 있는 값이 '('이 아닌 것도 괄호의 순서가 잘못되었다는
                // 뜻이므로 결과값을 0으로 바꾸고 반복문 탈출
                if(cal.isEmpty() || cal.peek() != '('){
                    result = 0;
                    break;
                }

                // 만약 stack의 맨 위 값이 '('이라면
                if(s.charAt(i - 1) == '('){
                    // 소괄호가 완성 되는 것이므로
                    // 중간에 계산한 값을 최종 결과값에 더함
                    // ex) - ()()일 경우, 2 + 2이므로
                    result = result + mid;
                }

                // 그리고 stack에서 맨 위의 값을 빼낸 뒤,
                cal.pop();
                // 중간 계산값에서 2 나눈 값을 중간 계산값을
                // 저장하는 변수에 다시 저장
                mid = mid / 2;
            }
            // 만약 문자가 '['라면 대괄호가 열리는 것이므로
            // stack에 [ 를 넣고, []가 될 수도 있으므로
            // 중간 결과값에 3을 곱함 -> ex - [[]]이면 3 * 3이므로
            else if(c == '['){
                cal.push(c);

                mid = mid * 3;
            }
            // 문자가 ']'이라면 대괄호가 닫히는 것
            else if(c == ']'){
                // 만약 stack이 비어있다면 괄호의 순서가 잘못되었다는 뜻이고
                // stack의 맨 위에 있는 값이 '['이 아닌 것도 괄호의 순서가 잘못되었다는
                // 뜻이므로 결과값을 0으로 바꾸고 반복문 탈출
                if(cal.isEmpty() || cal.peek() != '['){
                    result = 0;
                    break;
                }

                // 만약 stack의 맨 위 값이 '['이라면
                if(s.charAt(i - 1) == '['){
                    // 소괄호가 완성 되는 것이므로
                    // 중간에 계산한 값을 최종 결과값에 더함
                    // ex) - [][]일 경우, 3 + 3이므로
                    result = result + mid;
                }

                // 그리고 stack에서 맨 위의 값을 빼낸 뒤,
                cal.pop();
                // 중간 계산값에서 3 나눈 값을 중간 계산값을
                // 저장하는 변수에 다시 저장
                mid = mid / 3;
            }
        }

        // 만약 stack이 모두 비었다면 모든 괄호가 올바르게 연결되었다는 뜻이므로
        // 결과값을 출력
        if(cal.isEmpty()){
            System.out.println(result);
        }
        // 비어있지 않다면 괄호가 올바르게 연결되어있지 않았다는 뜻이므로
        // 0을 출력
        else{
            System.out.println(0);
        }
    }
}
