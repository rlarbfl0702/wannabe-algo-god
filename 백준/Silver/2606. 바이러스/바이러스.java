import java.util.*;
import java.io.*;

public class Main {
    static Set<Integer> warm[];
    static Set<Integer> result;
    static boolean visited[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 컴퓨터 개수
        int N = Integer.parseInt(br.readLine());

        // 컴퓨터 쌍의 수
        int C = Integer.parseInt(br.readLine());

        // 컴퓨터 연결 저장할 HashSet 2차원 배열
        warm = new HashSet[N + 1];

        // HashSet으로 초기화
        for (int i = 0; i <= N; i++) {
            warm[i] = new HashSet<>();
        }
        // 결과 컴퓨터를 저장할 set (중복 값이 들어가면 안되므로)
        result = new HashSet<>();

        // 방문 여부
        visited = new boolean[N + 1];

        for(int i = 0; i < C; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 컴퓨터 번호 입력
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 해당 컴퓨터에 양방향으로 연결
            warm[a].add(b);
            warm[b].add(a);

        }

        BFS(1);

        System.out.println(result.size() - 1);
    }

    public static void BFS(int c){
        Queue<Integer> q = new LinkedList<>();

        // queue에 찾을 컴퓨터 번호를 넣어줌
        q.offer(c);
        // 해당 번호 방문 처리
        visited[c] = true;

        // queue가 빌때까지 반복
        while(!q.isEmpty()){
            // queue에 들어있는 번호를 꺼냄
            int num = q.poll();

            // 결과값을 저장할 배열에 해당 번호 저장
            result.add(num);

            // 해당 번호 컴퓨터에 연결된 컴퓨터 번호들 중
            for(int i : warm[num]){
                // 방문하지 않은 곳이 있다면
                if(!visited[i]){
                    // 방문 처리 후
                    visited[i] = true;

                    // queue에 해당 번호를 넣음
                    q.offer(i);
                }
            }
        }
    }
}
