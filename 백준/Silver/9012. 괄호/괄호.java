import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack;

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            stack = new ArrayDeque<>();
            String str = br.readLine();

            loop: for(int i=0; i<str.length(); i++) {
                switch (str.charAt(i)) {
                    case '(':
                    case '[': {
                        stack.addLast(str.charAt(i));
                        break;
                    }
                    case ')': {
                        if(!stack.isEmpty() && stack.peekLast() == '(') {
                            stack.removeLast();
                            break;
                        }
                        else {
                            stack.addLast('n');
                            break loop;
                        }
                    }
                    case ']': {
                        if(!stack.isEmpty() && stack.peekLast() == '[') {
                            stack.removeLast();
                            break;
                        }
                        else {
                            stack.addLast('n');
                            break loop;
                        }
                    }
                }
            }
            if(stack.isEmpty()) {
                sb.append("YES").append('\n');
                continue;
            }
            sb.append("NO").append('\n');
        }

        System.out.println(sb);
    }
}
