import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[4];
        int arr2[] = new int[2];

        for(int i = 0; i < 4; i++){
            int n = Integer.parseInt(br.readLine());

            arr[i] = n;
        }

        for(int i = 0; i < 2; i++){
            int m = Integer.parseInt(br.readLine());

            arr2[i] = m;
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int result = arr[1] + arr[2] + arr[3] + arr2[1];

        System.out.println(result);
    }
}
