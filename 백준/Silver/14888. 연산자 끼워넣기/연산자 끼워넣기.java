import java.io.*;
import java.util.*;

public class Main{
    // ( +, -, *, / )
    static int[] operator = new int[4];
    static int maxVal = Integer.MIN_VALUE;
    static int minVal = Integer.MAX_VALUE;
    static int N;
    static int[] order;
    static int[] numbers;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        numbers = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        order = new int[N-1];
        dfs(0);
        System.out.println(maxVal + "\n" + minVal);
    }
    static void dfs(int depth) {
        if(depth == N-1) {
            // 연산 수행 결과 갱신
            calculate();
            return;
        }
        for(int i=0; i<4; i++) {
            if(operator[i] > 0) {
                order[depth] = i+1;
                operator[i]--;
                dfs(depth+1);
                order[depth] = 0;
                operator[i]++;
            }
        }
    }
    static void calculate() {
        int idx = 0;
        int result = numbers[0];
        for(int i=1; i<N; i++) {
            switch (order[idx++]) {
                case 1:
                    result += numbers[i];
                    break;
                case 2:
                    result -= numbers[i];
                    break;
                case 3:
                    result *= numbers[i];
                    break;
                default:
                    result /= numbers[i];
                    break;
            }
        }
        maxVal = Math.max(maxVal, result);
        minVal = Math.min(minVal, result);
    }
}