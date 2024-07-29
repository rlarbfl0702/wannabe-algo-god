import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1001];
        int n = Integer.parseInt(br.readLine());

        arr[1] = 1;
        arr[2] = 2;
        for(int i=3; i<1001; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            arr[i] %= 10007;
        }
        System.out.println(arr[n]);
    }
}