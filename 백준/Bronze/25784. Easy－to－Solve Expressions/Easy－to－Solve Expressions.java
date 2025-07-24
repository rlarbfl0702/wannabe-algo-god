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

        int sum = arr[0] + arr[1];
        int mul = arr[0] * arr[1];

        if(arr[2] == sum){
            System.out.println(1);
        }
        else if(arr[2] == mul){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
    }
}
