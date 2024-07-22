import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // queue와 stack을 모두 쓰기 위해서
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int test = 0; test < N; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 명령어를 입력받음
            String order = st.nextToken();

            // 만약 명령어가 push라면
            if(order.equals("push")){
                int n = Integer.parseInt(st.nextToken());

                // 수가 queue처럼 저장되어야 하므로 addLast로
                // n을 queue에 추가
                q.addLast(n);
            }
            // 만약 명령어가 pop이라면
            else if(order.equals("pop")){
                // 만약 queue가 비어있다면 -1 출력
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                // 비어있지 않다면
                else{
                    // 가장 위에 있는 정수를 빼내고 저장하고 출력
                    int n = q.pollFirst();

                    sb.append(n + "\n");
                }
            }
            // 만약 명령어가 size라면
            else if(order.equals("size")){
                // queue의 사이즈를 저장 후 출력
                int n = q.size();

                sb.append(n + "\n");
            }
            // 만약 명령어가 empty라면
            else if(order.equals("empty")){
                // queue가 비어있을 경우
                if(q.isEmpty()){
                    // 1출력
                    sb.append(1 + "\n");
                }
                // 비어있지 않다면
                else{
                    // 0출력
                    sb.append(0 + "\n");
                }
            }
            // 만약 명령어가 front이고
            else if(order.equals("front")){
                // queue가 비어있다면
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                // 비어있지 않다면
                else{
                    // 제일 앞에 저장된 값을 저장 후 출력
                    int n = q.peekFirst();

                    sb.append(n + "\n");
                }
            }
            // 만약 명령어가 back이고
            else if(order.equals("back")){
                // queue가 비어있다면
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                // 비어있지 않다면
                else{
                    // 제일 나중에 저장된 값을 저장 후 출력
                    int n = q.peekLast();

                    sb.append(n + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
