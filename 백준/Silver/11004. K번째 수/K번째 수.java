import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            arr.add(n);
        }

        Collections.sort(arr);

        int cnt = 1;

        for(int n : arr){
            if(cnt == K){
                System.out.println(n);

                break;
            }

            cnt = cnt + 1;
        }
    }
}
