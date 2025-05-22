import java.io.*;
import java.util.*;

public class Main {
    // 문자열을 뒤집는 함수 (Rev)
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // Rev(X), Rev(Y)
        int revX = Integer.parseInt(reverse(s1));
        int revY = Integer.parseInt(reverse(s2));

        // Rev(Rev(X) + Rev(Y))
        int sum = revX + revY;
        String result = reverse(Integer.toString(sum));

        // 앞에 0이 있을 수 있으므로 Integer로 파싱 후 다시 출력
        System.out.println(Integer.parseInt(result));
    }
}
