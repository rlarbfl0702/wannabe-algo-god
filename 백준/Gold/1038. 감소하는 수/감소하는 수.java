import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Long> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 감소하는 수 생성 함수
        Dnum();

        // 만약 N번째 감소하는 수가 존재하지 않으면 -1 출력
        if (N >= list.size()) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(N));
        }
    }

    static void Dnum() {
        // 앞자리 수
        for (int i = 0; i < 10; i++) {
            dfs(i, i);
        }

        // 오름차순으로 정렬
        Collections.sort(list);
    }

    // dfs를 활용하여 감소하는 수를 생성
    static void dfs(long num, int lastDigit) {
        // 처음 숫자를 리스트에 추가
        list.add(num);

        // 해당 자릿수보다 작은 숫자로
        // 다시 dfs를 돌림
        for (int i = 0; i < lastDigit; i++) {
            // 해당 숫자를 기반으로 자릿수를 늘려서 다시 dfs를 돌림
            // ex) num이 1일 경우, (10, 0)으로 돌릴 수 있으며
            // num이 2일 경우, (20, 0), (21, 1)로 돌릴 수 있음
            // (20, 0)의 경우, 20이 리스트에 추가되고 0보다 작은 숫자는 없으므로 dfs 종료
            dfs(num * 10 + i, i);
        }
    }
}
