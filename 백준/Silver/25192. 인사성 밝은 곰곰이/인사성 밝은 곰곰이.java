import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(str.equals("ENTER")) {
                if(!set.isEmpty()) {
                    answer += set.size();
                    set.clear();
                }
                continue;
            }
            set.add(str);
        }
        answer += set.size();
        System.out.println(answer);
    }
}