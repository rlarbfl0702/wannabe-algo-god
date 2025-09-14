import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1);
        map.put('O', 1);
        map.put('B', 1);
        map.put('I', 1);
        map.put('S', 1);

        for(int i=0; i<str.length(); i++) {
            if(map.getOrDefault(str.charAt(i), -1) > 0) {
                map.replace(str.charAt(i), map.get(str.charAt(i))-1);
            }
        }

        int result = map.get('M')+map.get('O')+map.get('B')+map.get('I')+map.get('S');

        if(result == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
