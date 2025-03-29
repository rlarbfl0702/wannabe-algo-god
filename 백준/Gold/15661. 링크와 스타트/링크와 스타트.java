import java.io.*;
import java.util.*;

public class Main{
    static int[][] graph;
    static int N;
    static int[] team1;
    static boolean[] visited;
    static boolean[] visited2;
    static boolean[] team;
    static int[] teamCnt;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        team1 = new int[N/2];
        visited = new boolean[N];
        visited2 = new boolean[N];
        teamCnt = new int[2];
        graph = new int[N][N];
        team = new boolean[N];

        // 그래프 입력
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<N/2+1; i++) {
            recur(0, 0, i);
        }

        System.out.println(answer);
    }

    static void recur(int start, int depth, int max) {
        // 팀 나누기
        if(depth == max) {
            int t = 0;
            for(int i=0; i<N; i++) {
                if(team[i]) {
                    t++;
                }
            }
            int[] team1 = new int[t];
            int[] team2 = new int[N-t];

            int t1 = 0;
            int t2 = 0;
            for(int i=0; i<N; i++){
                if(team[i]) {
                    team1[t1++] = i;
                }
                else {
                    team2[t2++] = i;
                }
            }
            int tmp = 0;

            for(int i=0; i<t1-1; i++) {
                for(int j=i+1; j<t1; j++) {
                    tmp += graph[team1[i]][team1[j]] + graph[team1[j]][team1[i]];
                }
            }

            for(int i=0; i<t2-1; i++) {
                for(int j=i+1; j<t2; j++) {
                    tmp -= graph[team2[i]][team2[j]] + graph[team2[j]][team2[i]];
                }
            }


            answer = Math.min(answer, Math.abs(tmp));
            return;
        }

        for(int i=start; i<N; i++) {
            if(visited[i]) {
                continue;
            }
            team[i] = true;
            visited[i] = true;
            recur(i,depth+1, max);
            team[i] = false;
            visited[i] = false;
        }
    }
}