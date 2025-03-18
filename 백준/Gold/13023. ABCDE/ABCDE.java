import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static ArrayList<Integer> map[];
    public static boolean visited[];
    public static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new ArrayList[N];

        for(int i = 0; i < N; i++){
            map[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st2.nextToken());
            int f = Integer.parseInt(st2.nextToken());

            map[s].add(f);
            map[f].add(s);
        }

        result = 0;

        for(int i = 0; i < N; i++){
            visited = new boolean[N];

            visited[i] = true;

            DFS(i,1);

            if(result == 1){
                break;
            }
        }

        System.out.println(result);
    }

    public static void DFS(int s, int n){
        if(n == 5){
            result = 1;
            
            return;
        }

        // 만약 현재 사람과 연결된 사람 중
        for(int i : map[s]){
            // 해당 사람을 방문하지 않았다면
            if(!visited[i]){
                // 해당 사람을 방문처리 후,
                visited[i] = true;

                // 깊이를 1 늘리고, 시작점을 해당 사람으로 바꿈
                DFS(i, n + 1);

                // 다시 해당 사람의 방문처리를 false로 바꿈
                visited[i] = false;
            }
        }

        return;
    }
}
