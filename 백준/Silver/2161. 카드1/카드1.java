import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = N; i >= 1; i--){
            dq.addFirst(i);
        }

        while(true){
            sb.append(dq.pollFirst() + " ");

            if(dq.isEmpty()){
                break;
            }

            int n = dq.pollFirst();

            dq.addLast(n);
        }

        System.out.println(sb);
    }
}
