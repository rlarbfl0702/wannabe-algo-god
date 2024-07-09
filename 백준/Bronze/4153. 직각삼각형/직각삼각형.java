import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if(x+y+z == 0) {
                break;
            }

            int maximum = Math.max(Math.max(x, y), z);
            int test = 0;
            if(x != maximum) {
                test += Math.pow(x, 2);
            }
            if(y != maximum) {
                test += Math.pow(y, 2);
            }
            if(z != maximum) {
                test += Math.pow(z, 2);
            }

            if(Math.pow(maximum, 2) == test) {
                sb.append("right");
            }
            else{
                sb.append("wrong");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
