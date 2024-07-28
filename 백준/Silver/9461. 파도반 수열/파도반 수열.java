import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] arr = new long[101];
        arr[1] = arr[2] = arr[3] = 1;
        for(int i=4; i<101; i++) {
            arr[i] = arr[i-3] + arr[i-2];
        }

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.println(sb);
    }
}