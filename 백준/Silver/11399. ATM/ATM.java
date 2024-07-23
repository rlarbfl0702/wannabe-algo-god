import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] time = new int[N];

        for(int i=0; i<N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);

        int[] tmp = new int[N];
        tmp[0] = time[0];

        int total = tmp[0];
        for(int i=1; i<N; i++){
            tmp[i] = time[i] + tmp[i-1];
            total += tmp[i];
        }
        System.out.println(total);

    }
}