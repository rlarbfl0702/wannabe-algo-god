import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int tmp = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > tmp) {
                tmp = i;
            }
        }
        System.out.println(tmp);
    }
}
