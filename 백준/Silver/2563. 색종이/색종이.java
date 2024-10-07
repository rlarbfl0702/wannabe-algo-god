import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[][] paper = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken())-1;
            int n2 = Integer.parseInt(st.nextToken())-1;
            for(int y=0; y<10; y++) {
                for(int x=0; x<10; x++) {
                    paper[n1+y][n2+x] = true;
                }
            }
        }

        int answer = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(paper[i][j]) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}