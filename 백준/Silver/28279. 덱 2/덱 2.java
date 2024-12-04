import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            if(n == 1){
                int x = Integer.parseInt(st.nextToken());

                q.offerFirst(x);
            }
            else if(n == 2){
                int x = Integer.parseInt(st.nextToken());

                q.offerLast(x);
            }
            else if(n == 3){
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                else{
                    int x = q.pollFirst();

                    sb.append(x + "\n");
                }
            }
            else if(n == 4){
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                else{
                    int x = q.pollLast();

                    sb.append(x + "\n");
                }
            }
            else if(n == 5){
                sb.append(q.size() + "\n");
            }
            else if(n == 6){
                if(q.isEmpty()){
                    sb.append(1 + "\n");
                }
                else{
                    sb.append(0 + "\n");
                }
            }
            else if(n == 7){
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                else{
                    int x = q.getFirst();

                    sb.append(x + "\n");
                }
            }
            else if(n == 8){
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                else{
                    int x = q.getLast();

                    sb.append(x + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
