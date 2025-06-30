import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d[] = new int[4]; // 깊이 4개를 입력받음

        for (int i = 0; i < 4; i++) {
            int n = Integer.parseInt(br.readLine());
            d[i] = n;
        }

        int start = d[0];

        // 각각 오름차순, 내림차순, 일정 여부를 나타내는 boolean
        boolean r = false;
        boolean f = false;
        boolean s = false;

        for (int i = 1; i < 4; i++) {
            int m = d[i];

            // 방향 결정
            if (!r && !f && !s) {
                if (start < m) r = true;
                else if (start > m) f = true;
                else s = true;
            } else {
                // 이미 방향이 정해졌는데 현재 값이 그 방향과 맞지 않으면 No Fish 출력
                if (r && start >= m) {
                    System.out.println("No Fish");
                    return;
                }
                if (f && start <= m) {
                    System.out.println("No Fish");
                    return;
                }
                if (s && start != m) {
                    System.out.println("No Fish");
                    return;
                }
            }

            start = m; // 이전 값을 현재 값으로 갱신
        }

        // 끝까지 모순 없이 왔다면 방향에 따라 출력
        if (r) {
            System.out.println("Fish Rising");
        } else if (f) {
            System.out.println("Fish Diving");
        } else {
            System.out.println("Fish At Constant Depth");
        }
    }
}
