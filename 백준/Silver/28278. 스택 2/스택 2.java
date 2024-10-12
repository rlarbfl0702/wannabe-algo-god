import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    else {
                        sb.append(-1);
                    }
                    sb.append('\n');
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    if(!stack.isEmpty()) {
                        sb.append(0);
                    }
                    else {
                        sb.append(1);
                    }
                    sb.append('\n');
                    break;
                default:
                    if(!stack.isEmpty()) {
                        sb.append(stack.peek());
                    }
                    else {
                        sb.append(-1);
                    }
                    sb.append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}