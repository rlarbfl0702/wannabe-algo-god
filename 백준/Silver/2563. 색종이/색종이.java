import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[][] paper = new boolean[100][100];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken()) - 1;
            int n2 = Integer.parseInt(st.nextToken()) - 1;
            for(int a=0; a<10; a++) {
                for(int b=0; b<10; b++) {
                    paper[n1+a][n2+b] = true;
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