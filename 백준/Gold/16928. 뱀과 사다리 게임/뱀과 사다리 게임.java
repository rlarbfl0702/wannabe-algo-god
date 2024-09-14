import java.io.*;
import java.util.*;

public class Main {
    static int[] board;
    static int[] path;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new int[101];
        path = new int[101];
        visited = new boolean[101];

        for(int i=0; i<N+M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            board[n1] = n2;
        }
        bfs();
        System.out.println(path[100]);
    }
    static void bfs() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(1);
        path[1] = 0;
        visited[1] = true;

        while(!queue.isEmpty()) {
            int num = queue.removeFirst();
            if(num == 100) {
                return;
            }
            for(int i=1; i<7; i++) {
                int newNum = num+i;
                if(newNum > 100) {
                    return;
                }
                if(visited[newNum]) {
                    continue;
                }
                visited[newNum] = true;

                if(board[newNum] != 0) {
                    if(!visited[board[newNum]]) {
                        visited[board[newNum]] = true;
                        path[board[newNum]] = path[num] + 1;
                        queue.addLast(board[newNum]);
                    }
                }
                else {
                    path[newNum] = path[num] + 1;
                    queue.addLast(newNum);
                }
            }
        }
    }
}