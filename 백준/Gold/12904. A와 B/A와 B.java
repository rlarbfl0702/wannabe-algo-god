import java.io.*;
import java.util.*;

public class Main {

    public static String S;
    public static String T;
    public static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();
        T = br.readLine();

        result = 0;

        // 영단어를 조합할 Deque
        Deque<Character> dq = new ArrayDeque<>();

        for(int i = 0; i < T.length(); i++){
            Character c = T.charAt(i);

            // 기존 문자열을 Deque에 순서대로 삽입
            dq.addLast(c);
        }

        dfs(dq, true);

        System.out.println(result);
    }

    public static void dfs(Deque<Character> q, boolean fb){
        if (result == 1){
            return;
        }

        // Deque의 크기와 S의 길이가 같다면
        if (q.size() == S.length()) {
            // Deque의 카피본
            Deque<Character> copy = new ArrayDeque<>(q);
            StringBuilder sb = new StringBuilder();

            if(!fb){
                // 뒤집힌 상태일 때 뒤에서부터 빼야함
                for (int i = 0; i < S.length(); i++) {
                    sb.append(copy.pollLast());
                }
            }
            else{
                // 정방향이면 앞에서부터 빼야함
                for (int i = 0; i < S.length(); i++) {
                    sb.append(copy.pollFirst());
                }
            }

            // 만약 만들어진 문자열이 같다면 결과값을 1로 바꿈
            if (sb.toString().equals(S)) {
                result = 1;
            }
            return;
        }

        // 뒤집혀있지 않다면
        if(fb){
            // A가 뒤에 있다면 제거
            if (q.peekLast() == 'A') {
                q.pollLast();
                dfs(q, fb);
                q.addLast('A');
            }
            // B가 앞에 있다면 제거 후, 뒤집기
            if (q.peekLast() == 'B') {
                q.pollLast();
                dfs(q, !fb);
                q.addLast('B');
            }
        }
        // 뒤집혀 있고
        else{
            // A가 앞에 있다면 제거 (뒤집힌 상태이므로 뒤가 앞이기 때문에 앞에서 A를 제거)
            if (q.peekFirst() == 'A') {
                q.pollFirst();
                dfs(q, fb);
                q.addFirst('A');
            }
            // B가 뒤에 있다면 제거 후, 뒤집기
            // (뒤집힌 상태이므로 뒤가 앞이기 때문에 뒤에서 B를 제거 후 뒤집음)
            if (q.peekFirst() == 'B') {
                q.pollFirst();
                dfs(q, !fb);
                q.addFirst('B');
            }
        }
    }
}
