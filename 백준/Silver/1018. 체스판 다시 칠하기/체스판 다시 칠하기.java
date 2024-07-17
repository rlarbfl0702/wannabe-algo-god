import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chess = new char[N][M];

        for(int i=0; i<N; i++) {
            chess[i] = br.readLine().toCharArray();
        }

        int cnt1 = 0;
        int cnt2 = 0;
        int answer = Integer.MAX_VALUE;

        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                cnt1 = 0;
                cnt2 = 0;
                for(int x=0; x<8; x++) {
                    for(int y=0; y<8; y++) {
                        if((i+x)%2==0) {
                            if((j+y)%2==0) {
                                if(chess[i+x][j+y] != 'W') {
                                    cnt1++;
                                }
                                else {
                                    cnt2++;
                                }
                            }
                            else {
                                if(chess[i+x][j+y] != 'B') {
                                    cnt1++;
                                }
                                else{
                                    cnt2++;
                                }
                            }
                        }
                        else {
                            if((j+y)%2==0) {
                                if(chess[i+x][j+y] != 'B') {
                                    cnt1++;
                                }
                                else {
                                    cnt2++;
                                }
                            }
                            else {
                                if(chess[i+x][j+y] != 'W') {
                                    cnt1++;
                                }
                                else{
                                    cnt2++;
                                }
                            }
                        }
                    }
                }
                answer = Math.min(answer, Math.min(cnt1, cnt2));
                if(answer == 0) {
                    System.out.println(answer);
                    return;
                }
            }
        }
        System.out.println(answer);
    }
}