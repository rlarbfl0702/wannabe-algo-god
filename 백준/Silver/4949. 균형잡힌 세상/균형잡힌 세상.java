import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack;
        while(true) {
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }

            stack = new ArrayDeque<>();

            loop: for(int i=0; i<str.length(); i++) {
                switch (str.charAt(i)) {
                    case '(':
                    case '[': {
                        stack.addLast(str.charAt(i));
                        break;
                    }
                    case ')': {
                        if (!stack.isEmpty() && stack.peekLast() == '(') {
                            stack.removeLast();
                        }
                        else {
                            stack.addLast('n');
                            break loop;
                        }
                        break;
                    }
                    case ']': {
                        if (!stack.isEmpty() && stack.peekLast() == '[') {
                            stack.removeLast();
                        }
                        else {
                            stack.addLast('n');
                            break loop;
                        }
                        break;
                    }
                }
             }
            if(stack.isEmpty()) {
                sb.append("yes").append('\n');
                continue;
            }
            sb.append("no").append('\n');
        }

        System.out.println(sb);
    }
}
