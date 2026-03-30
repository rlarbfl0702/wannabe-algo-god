import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        if(X >= L && X <= R){
            System.out.println(X);
        }
        else if(X < L){
            System.out.println(L);
        }
        else if(X > R){
            System.out.println(R);
        }
    }
}