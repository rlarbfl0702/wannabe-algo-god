import java.io.*;
import java.util.*;

public class Main {
    static int r, c, answer, cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, N);

        recur(size, 0, 0);
        System.out.println(answer);
    }
    static void recur(int size, int x, int y) {
        if(size == 1) {
            answer = cnt;
            return;
        }
        // 2
        if(r < x+size/2 && c < y+size/2) {
            recur(size/2, x, y);
        }
        // 1
        else if(r < x+size/2 && c >= y+size/2) {
            cnt += size/2*size/2;
            recur(size/2, x, y+size/2);
        }
        // 3
        else if(r >= x+size/2 && c < y+size/2) {
            cnt += size/2*size/2*2;
            recur(size/2, x+size/2, y);
        }
        // 4
        else {
            cnt += size/2*size/2*3;
            recur(size/2, x+size/2, y+size/2);
        }
    }
}