import java.io.*;
import java.util.*;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        // 한자리 소수를 가지고 신기한 소수를 찾음
        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

        System.out.println(sb);
    }

    public static void dfs(int n, int d){
        // 민약 수의 길이가 N이 된다면 신기한 소수인 N자리 숫자이므로
        // 결과값에 추가
        if(d == N){
            sb.append(n + "\n");

            return;
        }

        // 짝수는 약수가 무조건 있으므로 홀수로만 뒷자리 수를 구성
        for(int i = 1; i <= 9; i = i + 2){
            // 기존 수를 뒷자리로 밀고 새로운 수를 일의자리로 새로운 수를 구성
            int nn = n * 10 + i;

            // 새로 만든 수가 소수라고 판명되면
            // 해당수를 가지고 다시 dfs를 돌림
            if(prime(nn)){
                dfs(nn, d + 1);
            }
        }
    }

    public static boolean prime(int n){
        // 만약 해당 숫자가 약수를 가지고 있다면
        // false를 return
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        // 해당 수가 약수를 가지고 있지 않다면 true를 return
        return true;
    }
}
