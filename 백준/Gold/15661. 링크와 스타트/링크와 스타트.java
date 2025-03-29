import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static int N;
    public static int team[][];
    public static int result;
    public static boolean visited[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        team = new int[N + 1][N + 1];

        result = Integer.MAX_VALUE;

        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 1; j <= N; j++){
                int n = Integer.parseInt(st.nextToken());

                team[i][j] = n;
            }
        }

        for(int i = 1; i < N/2+1; i++){
            visited = new boolean[N + 1];

            DFS(0, i, 1);
        }

        System.out.println(result);

    }

    public static void DFS(int n, int d, int cnt){
        if(n == d){
            int start = 0;
            int link = 0;

            // 방문한 적이 있다면 스타트팀이므로
            // 스타트팀 능력치 계산에 사용
            for(int i = 1; i <= N; i++){
                for(int j = i; j <= N; j++){
                    // 조합할 때, 똑같은 사람을 넣지 않기 위해서
                    if(i != j){
                        // 그 조합이 똑같지 않고
                        // 두 사람 다 방문을 했다면 스타트팀이므로
                        // 해당 배열의 값을 스타트팀 능력치에 더함
                        if(visited[i] && visited[j]){
                            start = start + team[i][j];
                            start = start + team[j][i];
                        }
                    }
                }
            }

            // 방문한 적이 없다면 링크팀이므로
            // 링크팀 능력치 계산에 사용
            for(int i = 1; i <= N; i++){
                for(int j = i; j <= N; j++){
                    // 조합할 때, 똑같은 사람을 넣지 않기 위해서
                    if(i != j){
                        // 그 조합이 똑같지 않고
                        // 두 사람 다 방문을 하지 않았다면 링크팀이므로
                        // 해당 배열의 값을 링크팀 능력치에 더함
                        if(!visited[i] && !visited[j]){
                            link = link + team[i][j];
                            link = link + team[j][i];
                        }
                    }
                }
            }

            int min = Math.abs(start - link);

            if(min <= result){
                result = min;

//                System.out.print("스타트팀 ");
//                for(int i = 1; i <= N; i++){
//                    if(visited[i]){
//                        System.out.print(i + " ");
//                    }
//                }
//                System.out.println("결과값 " + start + " " + link);
            }

            return;
        }

        for(int i = cnt; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;

                DFS(n + 1, d, i + 1);

                visited[i] = false;
            }
        }
    }
}
