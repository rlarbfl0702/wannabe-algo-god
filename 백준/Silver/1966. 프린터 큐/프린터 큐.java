import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            Deque<int[]> queue = new ArrayDeque<>();

            List<Integer> priority = new ArrayList<>();
            // 최댓값을 갱신하는 로직 => 내림 차순으로 정렬된 배열 or 컬렉션이 필요함
            // 해당 요소와 매칭되는 인덱스를 가지고 있어야 그 수가 수임을 인지함

            int maximum = Integer.MIN_VALUE;
            for(int i=0; i<N; i++) {
                int num = Integer.parseInt(st.nextToken());
                priority.add(num);
                queue.addLast(new int[]{i, num});
            }
            priority.sort(Collections.reverseOrder());

            int answer = 1;
            while(!queue.isEmpty()) {
                if(priority.get(0) == queue.peekFirst()[1]) {
                   if(M == queue.peekFirst()[0]) {
                       break;
                   }
                   priority.remove(0);
                   queue.removeFirst();
                   answer++;
                }
                else {
                    queue.addLast(queue.removeFirst());
                }
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
}
