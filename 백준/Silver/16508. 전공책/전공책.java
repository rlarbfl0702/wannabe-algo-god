import java.io.*;
import java.util.*;

public class Main {

    static public int[] cost;
    static public boolean[] visited;
    static public String[] books;
    static public int N;
    static public String s;
    static public int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 만들 글자
        s = br.readLine();

        // 책 수
        N = Integer.parseInt(br.readLine());

        // 가격 저장할 배열
        cost = new int[N];
        // 가격이랑 책 이름을 저장할 배열
        books = new String[N];
        // 책 조합을 만들 때 쓸, 방문 여부
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 가격
            cost[i] = Integer.parseInt(st.nextToken());
            // 책 이름
            books[i] = st.nextToken();
        }

        // 결과값 초기화
        result = Integer.MAX_VALUE;

        // 책 조합을 통해 최소 비용을 찾음
        for (int i = 1; i <= N; i++) {
            int[] arr = new int[i];
            DFS(0, i, arr);
        }

        // 결과값이 갱신되지 않았다면 -1 출력
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    // DFS 탐색
    public static void DFS(int depth, int limit, int[] pri) {
        if (depth == limit) {
            // 선택한 책 조합의 가격과 글자 매칭 수행
            checkWords(pri);
            return;
        }

        // 중복 조합 방지 (현재 depth의 이전 인덱스보다 큰 인덱스만 탐색)
        for (int i = (depth == 0) ? 0 : pri[depth - 1] + 1; i < N; i++) {
            if (!visited[i]) {

                visited[i] = true;
                pri[depth] = i;

                DFS(depth + 1, limit, pri);

                visited[i] = false;
            }
        }
    }

    // 선택한 책 조합으로 최소 비용 찾기
    public static void checkWords(int[] pri) {
        // 찾아야 하는 문자와 갯수를 저장할 HashMap
        HashMap<Character, Integer> targetCount = new HashMap<>();

        // 찾아야하는 문자열에서 글자를 키로 하여 그 문자의 갯수만큼 value값을 갱신
        for (char c : s.toCharArray()) {
            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
        }

        // 조합된 책들의 문자와 갯수를 저장할 HashMap
        HashMap<Character, Integer> currentCount = new HashMap<>();

        // 책의 총 가격
        int totalPrice = 0;

        // 조합된 책 배열의 총 가격을 계산하고
        for (int i : pri) {
            totalPrice += cost[i];

            // 해당 제목들에 있는 문자를 key값으로 하여 그 문자의 개수를 value로 저장
            for (char c : books[i].toCharArray()) {
                // 해당 문자가 이미 HashMap에 key값으로 있으면 기준 value값에 1을 더한 값을
                // value값으로 저장하고 없다면 1을 저장
                currentCount.put(c, currentCount.getOrDefault(c, 0) + 1);
            }
        }

        // 목표 글자가 모두 포함되어 있는지 확인
        boolean canMake = true;

        for (char key : targetCount.keySet()) {
            // 만약 찾아야되는 문자의 갯수가
            // 책 제목의 조합에서 찾은 문자의 갯수보다 작거나 해당 문자를
            // key 값으로 찾을 수 없다면
            if (currentCount.getOrDefault(key, 0) < targetCount.get(key)) {
                // 목표 글자를 모두 못 찾으므로 false로 변환
                canMake = false;

                break;
            }
        }


        // 목표 문자를 만들 수 있다면, 가격 갱신
        if (canMake) {
            result = Math.min(result, totalPrice);
        }
    }
}
