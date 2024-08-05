import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] paper;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        search(0,0, N);
        sb.append(white).append('\n').append(blue).append('\n');
        System.out.println(sb);
    }

    static void search(int x, int y, int size) {
        int type = paper[x][y];
        boolean flag = false;
        loop: for(int i=x; i<x+size; i++) {
            for(int j=y; j<y+size; j++) {
                if(paper[i][j] != type) {
                    flag = true;
                    break loop;
                }
            }
        }
        if(flag) {
            // 1사분면
            search(x, y+size/2, size/2);
            // 2사분면
            search(x, y, size/2);
            // 3사분면
            search(x+size/2, y, size/2);
            // 4사분면
            search(x+size/2, y+size/2, size/2);
        }
        else{
            if(type == 0) {
                white++;
            }
            else {
                blue++;
            }
        }
    }
}
