import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> num = new HashSet<>();

        for(int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());

            num.add(n%42);
        }

        System.out.println(num.size());
    }
}