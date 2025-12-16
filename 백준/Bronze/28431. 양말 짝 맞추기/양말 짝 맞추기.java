import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> h = new HashSet<>();

        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(br.readLine());

            if(h.contains(n)){
                h.remove(n);
            }
            else{
                h.add(n);
            }
        }

        Iterator iter = h.iterator();

        System.out.println(iter.next());
    }
}