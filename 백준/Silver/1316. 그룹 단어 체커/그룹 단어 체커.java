import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0; i<N; i++) {
            Map<Character, Integer> map = new HashMap<>();
            String str = br.readLine();
            boolean isGroup = true;
            char prev = ' ';
            for(int j=0; j<str.length(); j++) {
                char current = str.charAt(j);
                if(prev != current) {
                    if(map.getOrDefault(current, -1) < 0) {
                        map.put(current, 1);
                        prev = current;
                    }
                    else {
                        isGroup = false;
                        break;
                    }
                }
            }
            if(isGroup) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}