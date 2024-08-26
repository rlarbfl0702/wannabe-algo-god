import java.io.*;
import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 연산의 개수
        int N = Integer.parseInt(br.readLine());

        // 절대값과 그냥 수를 저장할 우선 순위 큐
        // 절대값을 기준으로 먼저 정렬하고 기존값을 기준으로 정렬함
        PriorityQueue<Point> q = new PriorityQueue<Point>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                // 절대값이 더 작은 순으로 정렬
                if(o1.x < o2.x){
                    return -1;
                }
                else if(o1.x > o2.x){
                    return 1;
                }
                // 만약 절대값이 같다면
                // 절대값을 만들기 전의 원래 숫자로
                // 더 작은 순으로 정렬
                else{
                    if(o1.y < o2.y){
                        return -1;
                    }
                    else if(o1.y > o2.y){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
            }
        });

        for(int i = 0; i < N; i++){
            // 입력받은 수
            int n = Integer.parseInt(br.readLine());

            // 만약 입력받은 수가 0이고
            if(n == 0){
                // 큐가 비었다면
                if(q.isEmpty()){
                    // 0을 출력하고
                    sb.append(0 + "\n");
                }
                // 큐가 비지 않았다면
                else{
                    // 큐에 저장되어 있는
                    // 맨 위의 원래 수를 저장 후
                    int out = q.peek().y;

                    // 큐에서 빼내고
                    q.poll();

                    // 출력
                    sb.append(out + "\n");
                }
            }
            // 입력받은 수가 0이 아니라면
            else{
                // 입력받은 수의 절대값으로 변환하여 저장 후,
                int n_abs = Math.abs(n);

                // 우선순위 큐에 절대값과 원래 수를 저장
                q.offer(new Point(n_abs, n));
            }
        }

        System.out.println(sb);
    }
}
