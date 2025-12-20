import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값이 10^18까지이므로 long 타입을 사용합니다.
        long a = sc.nextLong(); // 흰색 말의 개수
        long b = sc.nextLong(); // 검은색 말의 개수

        // 검은색 말이 하나도 없다면 스트라이프는 0개입니다.
        if (b == 0) {
            System.out.println(0);
        } else {
            // 검은색 띠의 최대 개수는 (흰색 말의 개수 + 1)과 (검은색 말의 개수) 중 작은 값입니다.
            long result = Math.min(a + 1, b);
            System.out.println(result);
        }

        sc.close();
    }
}