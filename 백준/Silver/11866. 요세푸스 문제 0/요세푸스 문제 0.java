import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<N+1; i++) {
            deque.addLast(i);
        }

        sb.append('<');

        while(true) {
            for(int i=0; i<K-1; i++) {
                deque.addLast(deque.removeFirst());
            }
            sb.append(deque.removeFirst());
            if(deque.isEmpty()){
                sb.append('>');
                break;
            }
            sb.append(", ");
        }

        System.out.println(sb);
    }
}