import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")) {
                queue.addLast(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.removeFirst()).append('\n');;
            }
            else if(command.equals("size")) {
                sb.append(queue.size()).append('\n');;
            }
            else if(command.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');;
            }
            else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append('\n');;
            }
            else {
                sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append('\n');;
            }
        }

        System.out.println(sb);
    }
}
