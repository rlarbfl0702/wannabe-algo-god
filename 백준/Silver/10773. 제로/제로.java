import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();

        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                stack.removeLast();
                continue;
            }
            stack.addLast(num);
        }

        int answer = 0;
        for(int s: stack) {
            answer += s;
        }
        System.out.println(answer);
    }
}
