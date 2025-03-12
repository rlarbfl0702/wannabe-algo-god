import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int map[][];
    public static ArrayList<Node> chickens;
    public static ArrayList<Node> homes;
    public static int min;
    public static boolean visited[];

    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        chickens = new ArrayList<>();
        homes = new ArrayList<>();
        min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++){
                int n = Integer.parseInt(st2.nextToken());

                // 집 좌표 저장
                if(n == 1){
                    homes.add(new Node(i, j));
                }
                // 치킨집 좌표 저장
                if(n == 2){
                    chickens.add(new Node(i, j));
                }
            }
        }

        // 치킨집의 방문 여부
        visited = new boolean[chickens.size()];

        DFS(0, 0);

        System.out.println(min);
    }

    public static void DFS(int d, int cnt){
        // 치킨집의 갯수가 제한된 갯수와 같아진다면
        if(cnt == M){

            // 해당 치킨집의 조합으로 구한 치킨거리와 현재 최소값을
            // 비교하여 갱신
            min = Math.min(min, distance());

            return;
        }
        else{
            // 치킨집의 갯수만큼 반복
            // 치킨집의 조합 구하기
            // (앞 인덱스 값에 접근하지 않기 위해서 d부터 반복문 시작)
            for(int i = d; i < chickens.size(); i++){
                // 해당 치킨집을 방문하지 않았다면
                if(!visited[i]){
                    // 해당 치킨집 방문처리
                    visited[i] = true;

                    // 그리고 인덱스 값 + 1 값과 치킨집 카운트 값 + 1으로 DFS를 돓림
                    DFS(i + 1, cnt + 1);

                    visited[i] = false;
                }
            }
        }
    }

    public static int distance(){
        int total = 0;

        for(Node home : homes){
            int d = Integer.MAX_VALUE;

            // 치킨집 갯수만큼 반복
            for(int i = 0; i < chickens.size(); i++){
                // 만약 해당 치킨집이 조합에 포함된다면
                if(visited[i]){
                    // 해당 순번의 치킨집 좌표를 가지고
                    Node chicken = chickens.get(i);

                    // 거리 계산
                    int sum = Math.abs(home.x - chicken.x) + Math.abs(home.y - chicken.y);

                    // 해당 집에서 여러 치킨집들과의 거리를 계산한 값들 중
                    // 제일 최솟값으로 해당 집의 치킨거리로 저장
                    d = Math.min(d, sum);
                }
            }

            // 총 거리 변수에다가 계산한 해당 집의 치킨거리를 더함
            total = total + d;
        }

        return total;
    }
}
