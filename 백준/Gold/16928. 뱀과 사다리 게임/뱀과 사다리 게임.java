import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int map[];
    static HashMap<Integer, Integer> up;
    static HashMap<Integer, Integer> down;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 길가는 횟수 저장할 배열
        map = new int[101];
        // 배열을 정수의 제일 큰 값으로 초기화
        Arrays.fill(map, Integer.MAX_VALUE);
        // 사다리가 있는 노드와 도착지 노드를 저장할 Hashmap
        up = new HashMap<>();
        // 뱀이 있는 노드와 도착지 노드를 저장할 Hashmap
        down = new HashMap<>();

        // 사다리 위치 정보 저장
        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            up.put(k, v);
        }

        // 뱀 위치 정보 저장
        for(int i = 0; i < M; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st3.nextToken());
            int v = Integer.parseInt(st3.nextToken());

            down.put(k, v);
        }

        BFS(1);

        System.out.println(map[100]);
    }

    public static void BFS(int x){
        Queue<Integer> q = new LinkedList<>();

        q.offer(x);

        map[x] = 0;

        // Queue가 빌때까지 반복
        while(!q.isEmpty()){
            int xx = q.poll();

            // 꺼낸게 100이라면 도착했으므로
            if(xx == 100){
                break;
            }

            // 주사위 1 ~ 6이기 때문에 1부터 6까지 반복
            for(int i = 1; i <= 6; i++){
                int nx = xx + i;

                // 이동한 좌표가 범위를 넘어가면 continue
                if(nx >= 101){
                    continue;
                }

                // 올라가는 사다리가 있는 노드라면
                if(up.containsKey(nx)){
                    int v = up.get(nx);

                    // 기존 배열 값
                    int origin = map[v];

                    // 해당 사다리를 타고 올라간 노드값의 기존 값과
                    // 기존 노드 +1 값을 비교해서 더 작은 값을 저장하고
                    map[v] = Math.min(map[v], map[xx] + 1);

                    // 만약 해당 배열값이 갱신 되었다면
                    // 더 최솟값 루트가 존재한다는 뜻이므로
                    if(origin != map[v]){
                        // Queue에 넣어줌
                        q.offer(v);
                    }
                }
                // 만약 내려가는 뱀이 있는 노드라면
                else if(down.containsKey(nx)){
                    int v = down.get(nx);

                    // 기존 배열 값
                    int origin = map[v];

                    // 해당 뱀을 타고 내려간 노드값의 기존 값과
                    // 기존 노드 +1 값을 비교해서 더 작은 값을 저장하고
                    map[v] = Math.min(map[v], map[xx] + 1);

                    // 만약 해당 배열값이 갱신 되었다면
                    // 더 최솟값 루트가 존재한다는 뜻이므로
                    if(origin != map[v]){
                        // Queue에 넣어줌
                        q.offer(v);
                    }
                }
                // 만약 둘다 아니라면 그냥 기존 노드에 +1 값을 저장하고
                else{
                    // 기존 배열 값
                    int origin = map[nx];

                    // 해당 노드의 기존 값과
                    // 기존 노드 +1 값을 비교해서 더 작은 값을 저장하고
                    map[nx] = Math.min(map[nx], map[xx] + 1);

                    // 만약 해당 배열값이 갱신 되었다면
                    // 더 최솟값 루트가 존재한다는 뜻이므로
                    if(origin != map[nx]){
                        // Queue에 넣어줌
                        q.offer(nx);
                    }
                }
            }
        }
    }
}
