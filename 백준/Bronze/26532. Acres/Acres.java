import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int size = N*M;
        int data = (int) Math.ceil((double) size/4840);
        int result = (int) Math.ceil((double) data/5);

        System.out.println(result);
    }
}
