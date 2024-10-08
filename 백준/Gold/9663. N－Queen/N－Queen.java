import java.io.*;
import java.util.*;

public class Main {
    static int[] board;
    static int N;
    static int answer = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        board = new int[N];

        dfs(0);
        System.out.println(answer);
    }
    static void dfs(int depth) {
        if(depth == N) {
            answer++;
            return;
        }

        for(int i=0; i<N; i++) {
            if(check(depth, i)) {
                board[depth] = i;
                dfs(depth+1);
            }
        }
    }

    static boolean check(int row, int col) {
        for(int i=0; i<row; i++) {
            if(board[i] == col || Math.abs(board[i]-col) == Math.abs(i-row)) {
                return false;
            }
        }
        return true;
    }
}