import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력이 들어올 수
        int N = Integer.parseInt(br.readLine());

        // 수를 저장할 stack
        Stack<Integer> num = new Stack<>();

        int result = 0;

        for(int i = 0; i < N; i++){
            // 한 줄에 숫자를 하나씩 입력받음
            int n = Integer.parseInt(br.readLine());

            // 만약 입력받은 숫자가 0일 경우
            if(n == 0){
                // 맨 위에 있는 숫자 pop
                // 정수가 0일 경우, 지울 수 있는 수가 있음을 보장할 수 있다고 했으므로
                num.pop();
            }
            // 아닐 경우, stack에 숫자를 넣음
            else{
                num.add(n);
            }
        }

        // stack이 비기 전까지 stack에 있는 값을 모두 더함
        while(!num.empty()){
            result = result + num.pop();
        }

        System.out.println(result);
    }
}
