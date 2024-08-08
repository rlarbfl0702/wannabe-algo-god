import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(!pQueue.isEmpty()) {
                    sb.append(pQueue.remove()).append('\n');
                }
                else {
                    sb.append(0).append('\n');
                }
                continue;
            }
            pQueue.add(num);
        }
        System.out.println(sb);
    }
}
