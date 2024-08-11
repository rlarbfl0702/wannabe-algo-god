import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 컬렉션에 데이터를 넣으면 remove되는 peek의 값이 minHeap의 최솟값이 됨
        // Primary Queue는 우선순위 큐로 우선순위가 가장 낮은 값이 먼저 나오게 되어있음
        // 우선순위가 낮다는 것은 Integer를 넣었을 때, 최솟값으로 판단됨
        // 따라서 반대로 정렬하면 최대힙이 되어 최댓값을 출력함
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 연산의 개수
        int N = Integer.parseInt(br.readLine());

        // 연산의 개수만큼 반복
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            // 만약 입력받은 수가 0일때
            if(x == 0){
                // maxHeap이 비어있다면
                if(maxHeap.isEmpty()){
                    // 0을 출력
                    sb.append(0 + "\n");
                }
                // 만약 maxHeap이 비어있지 않다면
                else{
                    // maxHeap의 꼭대기 값을 출력하고
                    sb.append(maxHeap.peek() + "\n");

                    // maxHeap의 맨 위의 값을 제거
                    maxHeap.poll();
                }
            }
            // 만약 입력받은 수가 0이 아니라면
            else{
                // maxHeap에 x를 추가
                maxHeap.add(x);
            }
        }

        System.out.println(sb);

    }
}
