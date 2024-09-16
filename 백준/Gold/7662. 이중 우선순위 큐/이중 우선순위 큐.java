import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int K = Integer.parseInt(br.readLine());
            for(int k=0; k<K; k++) {
                st = new StringTokenizer(br.readLine());
                char command = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                switch (command) {
                    case 'I':
                        map.put(num, map.getOrDefault(num, 0) + 1);
                        break;
                    case 'D':
                        if(map.isEmpty()) {
                            break;
                        }
                        int target = -1;
                        if(num == -1) {
                            target = map.firstKey();
                        }
                        else {
                            target = map.lastKey();
                        }
                        map.put(target, map.get(target)-1);
                        if(map.get(target) == 0) {
                            map.remove(target);
                        }
                        break;
                }
            }
            if(map.isEmpty()) {
                sb.append("EMPTY").append('\n');
            }
            else {
                sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
            }
        }
        System.out.println(sb);
    }
}