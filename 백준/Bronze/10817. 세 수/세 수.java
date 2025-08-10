import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[3];

        for(int i = 0; i < 3; i++){
            int n = Integer.parseInt(st.nextToken());

            arr[i] = n;
        }

        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}
