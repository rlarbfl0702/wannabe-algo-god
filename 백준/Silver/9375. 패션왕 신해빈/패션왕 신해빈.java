import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<String, Integer> map;

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());

            for(int n=0; n<N; n++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0)+1);
            }

            int answer = 1;
            for(int v: map.values()) {
                answer *= (v+1);
            }
            sb.append(answer-1).append('\n');
        }
        System.out.println(sb);
    }
}