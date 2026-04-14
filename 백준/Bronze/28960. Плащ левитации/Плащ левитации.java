import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a <= l && (b + 1) / 2 <= h){
            System.out.println("YES");
        }
        else if(b <= l && (a + 1) / 2 <= h){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}