import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] stair = new int[N+1];
        int[][] route = new int[N+1][2];

        for(int i=1; i<=N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        if(N > 1) {

            route[1][0] = route[1][1] = stair[1];
            route[2][0] = stair[2];
            route[2][1] = route[1][0] + stair[2];

            for (int i = 1; i < N; i++) {
                if (i + 1 <= N) {
                    if (i + 2 > 3) {
                        route[i + 1][1] = Math.max(route[i + 1][1], route[i][0] + stair[i + 1]);
                    }
                }
                if (i + 2 <= N) {
                    route[i + 2][0] = Math.max(Math.max(route[i + 2][0], route[i][0] + stair[i + 2]), route[i][1] + stair[i + 2]);
                }
            }

            System.out.println(Math.max(route[N][0], route[N][1]));
        }
        else {
            System.out.println(stair[1]);
        }
    }
}