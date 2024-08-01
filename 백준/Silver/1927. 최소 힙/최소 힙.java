import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 컬렉션에 데이터를 넣으면 remove되는 peek의 값이 minHeap의 최솟값이 됨
        // Primary Queue는 우선순위 큐로 우선순위가 가장 낮은 값이 먼저 나오게 되어있음
        // 우선순위가 낮다는 것은 Integer를 넣었을 때, 최솟값으로 판단됨
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 연산의 개수
        int N = Integer.parseInt(br.readLine());

        // 연산의 개수만큼 반복
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            // 만약 입력받은 수가 0일때
            if(x == 0){
                // minHeap이 비어있다면
                if(minHeap.isEmpty()){
                    // 0을 출력
                   sb.append(0 + "\n");
                }
                // 만약 minHeap이 비어있지 않다면
                else{
                    // minHeap의 꼭대기 값을 출력하고
                    sb.append(minHeap.peek() + "\n");

                    // minHeap의 맨 위의 값을 제거
                    minHeap.poll();
                }
            }
            // 만약 입력받은 수가 0이 아니라면
            else{
                // minHeap에 x를 추가
                minHeap.add(x);
            }
        }

        System.out.println(sb);
    }
}
