import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] graph;
    static boolean[] visited;
    static int[] team1;
    static int[] team2;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[N];
        team1 = new int[N/2];
        team2 = new int[N/2];
        comb(0, 0);

        System.out.println(answer);
    }
    static void comb(int start, int depth) {
        if(depth == N/2) {
            int cnt1 = 0;
            int cnt2 = 0;
            for(int i=0; i<N; i++) {
                if(visited[i]) {
                    team1[cnt1++] = i;
                }
                else {
                    team2[cnt2++] = i;
                }
            }
            // 계산
            cal();
            return;
        }
        for(int i=start; i<N; i++) {
            visited[i] = true;
            comb(i+1,depth + 1);
            visited[i] = false;
        }
    }
    static void cal() {
        int tmp = 0;
        for(int i=0; i<N/2-1; i++) {
            for(int j=i+1; j<N/2; j++) {
                tmp += graph[team1[i]][team1[j]] + graph[team1[j]][team1[i]];
                tmp -= graph[team2[i]][team2[j]] + graph[team2[j]][team2[i]];
            }
        }
        answer = Math.min(answer, Math.abs(tmp));
        return;
    }
}