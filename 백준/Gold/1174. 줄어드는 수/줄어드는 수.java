import java.io.*;
import java.util.*;

public class Main {

    // 줄어드는 수를 저장할 list
    public static ArrayList<Long> list =new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i <= 9; i++){
            // i를 시작 숫자로 dfs를 돌림
            dfs(i, 1);
        }

        // 만들어진 줄어드는 수를 오름차순으로 정렬
        Collections.sort(list);

        // 만약 N이 list의 크기보다 크다면 N번째 작은 줄어드는 수는
        // 없다는 뜻이므로 -1을 출력
        if(N > list.size()){
            System.out.println(-1);
        }
        // 아니라면 N번째 줄어드는 수를 출력
        else{
            System.out.println(list.get(N - 1));
        }
    }

    public static void dfs(long n, int len){
        // 만들어진 숫자를 리스트에 추가
        list.add(n);

        // 숫자의 길이가 10을 넘어가면 더 이상 숫자를 만들지 않아도 되므로 return
        // 작아지는 수 중에 제일 큰 수가 9876543210 이기 때문
        if(len >= 10){
            return;
        }

        // n의 마지막 자릿수보다 작은 수를 뒤에 붙여서 dfs를 다시 돌림
        for(int i = 0; i < n % 10; i++){
            // 새로운 수를 만들기 위해서
            // 현재수에 10을 곱하고 i를 더함
            dfs(n * 10 + i, len + 1);
        }
    }
}

