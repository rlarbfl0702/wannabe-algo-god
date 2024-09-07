import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int testCase = 0; testCase < T; testCase++){
            int N = Integer.parseInt(br.readLine());

            // 최솟값을 우선으로 우선 순위 저장
            PriorityQueue<Integer> minQ = new PriorityQueue<>();
            // 최댓값을 우선으로 우선 순위 저장
            PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
            // 삭제값을 저장할 Hashmap
            HashMap<Integer, Integer> cnt = new HashMap<>();

            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                // 연산 종류
                char cal = st.nextToken().charAt(0);
                // 숫자
                int n = Integer.parseInt(st.nextToken());

                // 숫자를 입력해야 될 때면
                if(cal == 'I'){
                    // 숫자를 Priority Queue에 각각 저장
                    minQ.offer(n);
                    maxQ.offer(n);
                    // 숫자들의 개수를 저장
                    cnt.put(n, cnt.getOrDefault(n, 0) + 1);
                }
                // 숫자를 빼야 될 때
                else if(cal == 'D'){
                    // 숫자가 -1이라면 최솟값을 빼야됨
                    if(n == -1){
                        // 최솟값을 제거하기 전 최적화를 한번 해줌
                        remove(minQ, cnt);

                        // Queue가 빈 값이 아닐 때
                        if(!minQ.isEmpty()){

                            int num = minQ.peek();

                            // 최솟값 Queue에서 제일 위에 있는 값을 제거 후,
                            minQ.poll();
                            // 해당 값과 해당 값의 value에 1을 뺀 값을
                            // Hashmap에 재저장
                            cnt.put(num, cnt.get(num) - 1);
                        }
                    }
                    // 숫자가 1이라면 최댓값을 빼야되므로
                    else if(n == 1) {
                        // 최댓값을 제거하기 전 최적화를 한번 해줌
                        remove(maxQ, cnt);

                        // Queue가 빈 값이 아닐 때
                        if(!maxQ.isEmpty()){

                            int num = maxQ.peek();

                            // 최댓값 Queue에서 제일 위에 있는 값을 제거 후,
                            maxQ.poll();
                            // 해당 값과 해당 값의 value에 1을 뺀 값을
                            // Hashmap에 재저장
                            cnt.put(num, cnt.get(num) - 1);
                        }
                    }
                }
            }

            // 최종적으로 출력하기 전, 각 Queue 최적화를 해줌
            remove(minQ, cnt);
            remove(maxQ, cnt);

            // 만약 모든 계산이 끝났을 때 Deque가 비어있다면
            if(minQ.isEmpty()){
                sb.append("EMPTY" + "\n");
            }
            // 비어있지않다면 최솟값과 최댓값을 출력
            else{
                sb.append(maxQ.peek() + " " + minQ.peek() + "\n");
            }
        }

        System.out.println(sb);
    }

    // 숫자가 삭제된게 다른 Queue에 남아있으면 제거할 함수
    public static void remove(PriorityQueue<Integer> queue, HashMap<Integer, Integer> count){
        // Queue가 빌때까지 그리고
        // Queue의 꼭대기에 있는 값에 대한 value가 0이 아니기 전까지 반복
        // 예를 들어,
        // maxQ에서 제거한 값이 minQ에서 제거가 안됐을 수도 있으므로
        // minQ에서 꼭대기값에 대한 value값을 HashMap에서 확인했을 때
        // 0일 경우, maxQ에서 이미 없앴다는 뜻이므로 minQ에서 꼭대기값을 제거
        // 어차피 제일 큰 값과 제일 작은 값만 출력하면 되기 때문에
        // minQ와 maxQ의 꼭대기값만 최적화를 유지하면 됨
        while (!queue.isEmpty() && count.get(queue.peek()) == 0) {
            queue.poll();
        }
    }
}
