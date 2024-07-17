import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 큐 사용
        Queue<Integer> q = new LinkedList<>();

        // 큐 값에 순서대로 숫자를 넣음
        for(int i = 1; i <= N; i++){
            q.offer(i);
        }

        // 큐에 남은 숫자가 한개가 되면 While문 종료
        while(true){
            if(q.size() == 1){
                break;
            }

            // 처음 숫자 꺼내기
            q.poll();
            // 다음 숫자를 꺼내서 저장 후
            int n = q.poll();

            // 다시 뒤에 저장
            q.offer(n);
        }

        System.out.println(q.poll());
    }
}
