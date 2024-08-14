import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] ground = new int[N][M];
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = -1;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                minHeight = Math.min(minHeight, ground[i][j]);
                maxHeight = Math.max(maxHeight, ground[i][j]);
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = -1;
        for(int h = minHeight; h<maxHeight+1; h++) {
            int time = 0;
            int spare = B;
            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    if(ground[i][j] > h) {
                        time += (ground[i][j] - h)*2;
                        spare += ground[i][j] - h;
                    }
                    else {
                        time += h - ground[i][j];
                        spare -= h - ground[i][j];
                    }
                }
            }
            if(spare >= 0) {
                if(time <= answerTime) {
                    answerTime = time;
                    answerHeight = h;
                }
            }
        }
        System.out.println(answerTime + " " + answerHeight);
    }
}