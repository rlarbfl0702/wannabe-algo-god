import java.io.*;
import java.util.*;

public class Main {
    static long answer = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dfs(N);
        System.out.println(answer);
    }
    static void dfs(int num) {
        if(num <= 1) {
            return;
        }
        answer *= num;
        dfs(num-1);
    }
}