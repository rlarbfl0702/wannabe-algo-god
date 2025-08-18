import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        TreeMap<String, String> map = new TreeMap<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String now = st.nextToken();

            map.put(name, now);
        }

        int size = map.size();
        Deque<String> dq = new ArrayDeque<>();

        for(int i = 0; i < size; i++){
            Map.Entry<String, String> tree = map.pollFirstEntry();
            
            if(tree.getValue().equals("enter")){
                dq.addLast(tree.getKey());
            }
        }

        int size2 = dq.size();

        for(int i = 0; i < size2; i++){
            sb.append(dq.pollLast() + "\n");
        }

        System.out.println(sb);
    }
}
