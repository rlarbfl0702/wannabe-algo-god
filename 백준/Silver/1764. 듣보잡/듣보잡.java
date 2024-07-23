import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new TreeMap<>();

        for(int i=0; i<N; i++) {
            map.put(br.readLine(), 1);
        }

        List<String> list = new ArrayList<>();

        int cnt = 0;
        for(int i=0; i<M; i++) {
            String str = br.readLine();
            int num = map.getOrDefault(str, -1);
            if(num > 0) {
                list.add(str);
            }
        }
        Collections.sort(list);

        sb.append(list.size()).append('\n');
        for(String str: list) {
            sb.append(str).append('\n');
        }
        System.out.println(sb);
    }
}