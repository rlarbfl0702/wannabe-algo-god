import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static boolean linked[][];
    public static boolean visited[][];
    public static int result;
    public static HashSet<Integer> people;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생 수
        N = Integer.parseInt(br.readLine());
        // 연결 수
        int M = Integer.parseInt(br.readLine());

        // 연결 여부
        linked = new boolean[N + 1][N + 1];
        // 방문 여부
        visited = new boolean[N + 1][N + 1];

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 시작점
            int s = Integer.parseInt(st.nextToken());
            // 끝점
            int f = Integer.parseInt(st.nextToken());

            linked[s][f] = true;
            linked[f][s] = true;
        }

        for(int i = 1; i <= N; i++){
            visited[i][1] = true;
        }

        // 결과값
        result = 0;
        // 초대하는 사람 저장할 HashSet
        // 사람이 중복 저장되면 안되므로 HashSet 사용
        people = new HashSet<>();

        // 친구와 친구의 친구까지 초대한다고 했으므로
        // 깊이 1과 2로 DFS를 돌림
        for(int i = 1; i <= 2; i++){

            DFS(1, 0, i);
        }

        // 사람 수를 결과값에 저장
        result = people.size();

        System.out.println(result);
    }

    public static void DFS(int start, int n, int d){
        if(n == d){
            // 깊이가 기준 깊이와 같아졌을 경우, 해당 친구를
            // 친구 목록에 저장함
            people.add(start);

            return;
        }
        else{
            for(int i = 1; i <= N; i++){
                // 해당 사람과 친구이고 해당 친구를 방문하지 않았을 경우
                if(linked[start][i] && !visited[start][i]){

                    // 해당 친구를 방문처리하고
                    visited[start][i] = true;

                    // 해당 친구를 시작 지점으로 다시 DFS를 돌림
                    DFS(i, n + 1, d);

                    // 해당 친구의 방문 여부를 다시 false로 바꿈
                    visited[start][i] = false;
                }
            }
        }
    }
}

