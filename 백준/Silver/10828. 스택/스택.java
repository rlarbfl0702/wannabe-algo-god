import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Integer> stack = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                stack.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if (command.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.removeFirst()).append('\n');
            }
            else if(command.equals("size")) {
                sb.append(stack.size()).append('\n');
            }
            else if(command.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            }
            else {
                sb.append(stack.isEmpty() ? -1 : stack.peekFirst()).append('\n');
            }
        }

        System.out.println(sb);
    }
}
