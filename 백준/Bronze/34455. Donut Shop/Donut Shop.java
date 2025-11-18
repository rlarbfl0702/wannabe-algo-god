import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        for (int i = 0; i < E; i++) {
            char type = br.readLine().charAt(0);
            int tmp = Integer.parseInt(br.readLine());
            if(type == '+') {
                D+=tmp;
            }
            else{
                D-=tmp;
            }
        }

        D = Math.max(D, 0);
        System.out.println(D);
    }
}
