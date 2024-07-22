import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // stack을 저장할 stack
        Stack<Integer> s = new Stack<>();

        for(int test = 0; test < N; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 명령어를 입력받음
            String order = st.nextToken();

            // 만약 명령어가 push라면
            if(order.equals("push")){
                int n = Integer.parseInt(st.nextToken());

                // n을 stack에 추가
                s.add(n);
            }
            // 만약 명령어가 pop이라면
            else if(order.equals("pop")){
                // 만약 stack이 비어있다면 -1 출력
                if(s.isEmpty()){
                    sb.append(-1 + "\n");
                }
                // 비어있지 않다면
                else{
                    // 가장 위에 있는 정수를 빼내고 저장하고 출력
                    int n = s.pop();

                    sb.append(n + "\n");
                }
            }
            // 만약 명령어가 size라면
            else if(order.equals("size")){
                // stack의 사이즈를 저장 후 출력
                int n = s.size();

                sb.append(n + "\n");
            }
            // 만약 명령어가 empty라면
            else if(order.equals("empty")){
                // stack이 비어있을 경우
                if(s.isEmpty()){
                    // 1출력
                    sb.append(1 + "\n");
                }
                // 비어있지 않다면
                else{
                    // 0출력
                    sb.append(0 + "\n");
                }
            }
            // 만약 명령어가 top이라면
            else if(order.equals("top")){
                // stack이 비어있다면
                if(s.isEmpty()){
                    sb.append(-1 + "\n");
                }
                // 비어있지 않다면
                else{
                    // 꼭대기 값을 저장 후 출력
                    int n = s.peek();

                    sb.append(n + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
