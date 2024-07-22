import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 만들어야될 수열
        int cal[] = new int[n];

        // 결과 배열
        int result[] = new int[n];

        // stack을 계산할 stack
        Stack<Integer> s = new Stack<>();

        List<String> out = new ArrayList<>();

        // 순서대로 숫자를 넣어줌
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());

            cal[i] = num;
        }

        // 만들어야될 수열의 순번
        int cnt = 0;

        // 1부터 n까지 반복
        for(int i = 1; i <= n; i++){
            // i를 stack에 넣음
            s.push(i);

            // stack에 넣었으므로 배열에 + 추가
            out.add("+");

            while(true){
                // 만약 만들어야되는 수열의 해당 순번 숫자와
                // stack에 꼭대기 숫자가 같다면
                // stack에서 꼭대기 값을 제거 후
                // 결과값 저장 배열에 - 추가
                // 그리고 결과 배열에 해당 숫자 추가
                if(cal[cnt] == s.peek()){
                    out.add("-");
                    result[cnt] = s.peek();
                    s.pop();
                    // 다음 순번으로 넘어감
                    cnt = cnt + 1;
                }
                // 만약 두개의 숫자가 같지 않다면 while문 종료
                else{
                    break;
                }

                // 만약 결과배열에 끝까지 다 들어갔거나 stack이 비었다면
                // while문 종료
                if(cnt == (n - 1) || s.isEmpty()){
                    break;
                }
            }
        }

        // n까지 모두 입력을 했으므로 stack에 남은
        // 숫자는 모두 빼는 방법밖에 없음
        for(int i = 0; i < s.size(); i++){
            out.add("-");
            result[cnt] = s.peek();
            s.pop();
            // 다음 순번으로 넘어감
            cnt = cnt + 1;
        }

        // 두 수열이 같은지 판별할 변수
        boolean same = true;

        // 만들어야되는 수열과 만든 수열이 같은지 비교
        for(int i = 0; i < n; i++){
            if(cal[i] != result[i]){
                same = false;
                break;
            }
        }

        if(same){
            for(int i = 0; i < out.size(); i++){
                sb.append(out.get(i) + "\n");
            }

            System.out.println(sb);
        }
        else{
            System.out.println("NO");
        }
    }
}
