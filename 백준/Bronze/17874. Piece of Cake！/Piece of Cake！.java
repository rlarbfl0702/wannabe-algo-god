import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int h2 = n - h;
        int v2 = n - v;

        int g_h = 0;
        int g_v = 0;

        if(h >= h2){
            g_h = h;
        }
        else{
            g_h = h2;
        }

        if(v >= v2){
            g_v = v;
        }
        else{
            g_v = v2;
        }

        System.out.println(g_h * g_v * 4);
    }
}
