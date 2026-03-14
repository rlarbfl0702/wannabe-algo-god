import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cmp = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N-1; i++) {
            int tmp = Integer.parseInt(br.readLine());
            min = Math.min(min, tmp);
            max = Math.max(max, tmp);
        }
        if (cmp >= max) {
            System.out.println("hard");
        }
        else if(cmp <= min){
            System.out.println("ez");
        }
        else System.out.println("?");
    }
}