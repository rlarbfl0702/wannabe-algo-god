import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean arr[] = new boolean[4];

        arr[1] = true;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(arr[n1]){
                arr[n1] = false;
                arr[n2] = true;
            }
            else if(arr[n2]){
                arr[n1] = true;
                arr[n2] = false;
            }
        }

        for(int i = 1; i < 4; i++){
            if(arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
