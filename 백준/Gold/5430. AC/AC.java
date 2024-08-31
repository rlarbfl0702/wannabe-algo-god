import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            Deque<Integer> deque = new ArrayDeque<>();
            String command = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String numbers = br.readLine();

            if (n > 0) {
                String[] numArr = numbers.substring(1, numbers.length() - 1).split(",");
                for (String num : numArr) {
                    deque.addLast(Integer.parseInt(num));
                }
            }

            boolean isReversed = false;
            boolean flag = false;
            for(char c: command.toCharArray()) {
                if(c == 'R') {
                    isReversed = !isReversed;
                }
                else {
                    if(deque.isEmpty()) {
                        flag = true;
                        break;
                    }
                    if(isReversed) {
                        deque.removeLast();
                    }
                    else {
                        deque.removeFirst();
                    }
                }
            }
            if(flag) {
                sb.append("error").append('\n');
            }
            else {
                sb.append('[');
                int count = 0;
                while(!deque.isEmpty()) {
                    if(count != 0) {
                        sb.append(',');
                    }
                    if(isReversed) {
                        sb.append(deque.removeLast());
                    }
                    else {
                        sb.append(deque.removeFirst());
                    }
                    count++;
                }
                sb.append(']').append('\n');
            }
        }
        System.out.println(sb);
    }
}