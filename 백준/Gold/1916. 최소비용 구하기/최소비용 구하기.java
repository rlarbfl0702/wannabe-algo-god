import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int map[][];
    public static int start;
    public static int end;
    public static int result;
    public static boolean visitied[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        map = new int[N + 1][N + 1];
        visitied = new boolean[N + 1];

        // 배열의 초기값을 -1로 저장
        for(int r[] : map){
            Arrays.fill(r, Integer.MAX_VALUE);
        }

        result = Integer.MAX_VALUE;

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            // 같은 경로가 여러개 들어왔을 때, 최솟값으로 갱신
            map[s][e] = Math.min(map[s][e], value);
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st2.nextToken());
        end = Integer.parseInt(st2.nextToken());

        BFS(start, end);

        System.out.println(result);
    }

    public static class Node implements Comparable<Node>{
        int idx;
        int v;

        public Node(int idx, int v){
            this.idx = idx;
            this.v = v;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.v, o.v); // 최소 비용 기준 정렬
        }
    }

    public static void BFS(int s, int e){
        PriorityQueue<Node> q = new PriorityQueue<>();

        // 해당 목적지로 갈 때 드는 비용을 저장할 배열
        int d[] = new int[N + 1];

        // 최솟값을 저장할 배열이므로 초기값을 Integer 최댓값으로 저장
        Arrays.fill(d, Integer.MAX_VALUE);

        // 시작지점의 가치를 0으로 저징
        d[s] = 0;

        // 시작지점과 가치를 queue에 넣음
        q.offer(new Node(s, 0));

        while(!q.isEmpty()){
            Node node = q.poll();

            int n = node.idx;
            int c = node.v;

            // 만약 해당 노드까지 가는데 필요한 최소의 가치보다
            // 해당 노드가 가지고 있는 가치가 더 크다면
            // 해당 경로는 최단 루트가 아니므로 continue
            if(c > d[n]){
                continue;
            }

            for(int i = 1; i <= N; i++){
                // 해당 경로가 존재한다면
                if(map[n][i] != Integer.MAX_VALUE){
                    // 현재 가치에서 해당 경로의 가치를 더한 값
                    int nc = c + map[n][i];

                    // 도착지점의(다음 시작점) 최소 가치보다 계산한
                    // 가치값이 더 작다면
                    if(nc < d[i]){
                        // 도착지점의 최소 가치값을 계산한 가치값으로 갱신하고
                        d[i] = nc;

                        // 해당 도착지점과 새로운 가치값을 queue에 넣음
                        q.offer(new Node(i, nc));
                    }
                }
            }
        }

        result = d[e];
    }
}
