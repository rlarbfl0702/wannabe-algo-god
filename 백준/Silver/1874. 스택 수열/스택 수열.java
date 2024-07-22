import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] numArr = new int[n];

        for(int i=0; i<n; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Deque<Integer> stack = new ArrayDeque<>();

        int cnt = 0;
        int num = 1;

        while(cnt != n) {
            if(stack.isEmpty()) {
                stack.addFirst(num);
                num++;
                if(num > n+1) {
                    break;
                }
                sb.append('+').append('\n');
                continue;
            }
            if(stack.peekFirst() != numArr[cnt]) {
                stack.addFirst(num);
                num++;
                if(num > n+1) {
                    break;
                }
                sb.append('+').append('\n');
            }
            else {
                stack.removeFirst();
                cnt++;
                sb.append('-').append('\n');
            }
        }
        if(cnt != n) {
            sb = new StringBuilder().append("NO").append('\n');
        }
        System.out.println(sb);
    }
}
