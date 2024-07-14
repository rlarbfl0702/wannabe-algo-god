import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i=0; i<N; i++) {
            set.add(br.readLine());
        }
        List<String> list = new ArrayList<>(set);

        list.sort((n1, n2) -> {
            if(n1.length() != n2.length()) {
                return n1.length() - n2.length();
            }
            return n1.compareTo(n2);
        });

        for(String l: list) {
            sb.append(l).append('\n');
        }
        System.out.println(sb);
    }
}
