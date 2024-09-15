import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            X -= Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        if(X != 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}