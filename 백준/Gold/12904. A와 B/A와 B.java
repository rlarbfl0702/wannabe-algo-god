import java.io.*;

public class Main {
    static String S, T;
    static int result = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        T = br.readLine();

        dfs(T);
        System.out.println(result);
    }

    // T에서 S로 줄여가는 역방향 DFS
    static void dfs(String current) {
        // 이미 성공했으면 리턴
        if (result == 1) return;

        // S와 길이가 같으면 비교
        if (current.length() == S.length()) {
            if (current.equals(S)) result = 1;
            return;
        }

        // A로 끝나면 A 제거하고 다음 탐색
        if (current.endsWith("A")) {
            dfs(current.substring(0, current.length() - 1));
        }

        // B로 끝나면 B 제거 + 뒤집기
        if (current.endsWith("B")) {
            StringBuilder sb = new StringBuilder(current.substring(0, current.length() - 1));
            dfs(sb.reverse().toString());
        }
    }
}
