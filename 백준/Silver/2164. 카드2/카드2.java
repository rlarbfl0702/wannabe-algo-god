import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<N+1; i++) {
            queue.addLast(i);
        }

        int answer = 0;
        while(true) {
            answer = queue.removeFirst();
            if(queue.isEmpty()){
                break;
            }
            queue.addLast(queue.removeFirst());
        }
        System.out.println(answer);

    }
}