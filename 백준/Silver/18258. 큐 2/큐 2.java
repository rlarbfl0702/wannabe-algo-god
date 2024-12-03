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

            String s = st.nextToken();

            if(s.equals("push")){
                int n = Integer.parseInt(st.nextToken());

                q.offer(n);
            }
            else if(s.equals("pop")){
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                else{
                    int n = q.poll();

                    sb.append(n + "\n");
                }
            }
            else if(s.equals("front")){
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                else{
                    int n = q.getFirst();

                    sb.append(n + "\n");
                }
            }
            else if(s.equals("back")){
                if(q.isEmpty()){
                    sb.append(-1 + "\n");
                }
                else{
                    int n = q.getLast();

                    sb.append(n + "\n");
                }
            }
            else if(s.equals("size")){
                sb.append(q.size() + "\n");
            }
            else if(s.equals("empty")){
                if(q.isEmpty()){
                    sb.append(1 + "\n");
                }
                else{
                    sb.append(0 + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
