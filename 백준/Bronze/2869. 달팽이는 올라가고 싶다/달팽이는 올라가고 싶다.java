import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int tree = Integer.parseInt(st.nextToken());

        int cnt = 1;
        int len = 0;

        len = tree - up;

        if(len >= 0){
            if(len % (up - down) == 0){
                len = len / (up - down);
            }
            else{
                len = len / (up - down) + 1;
            }

            cnt = cnt + len;
        }

        System.out.println(cnt);
    }
}
