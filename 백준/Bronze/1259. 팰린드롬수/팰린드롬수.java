import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String pel = br.readLine();

            // 입력이 0이 들어온다면 종료
            if (pel.equals("0")) {
                break;
            }

            // 한자리 수일때
            if(pel.length() == 1){
                sb.append("yes" + "\n");
            }

            // 숫자가 짝수개든 홀수개든 가운데 숫자는 뭐가 오든 상관이 없으니
            // 짝수, 홀수 구분 필요 x
            for (int i = 0; i < pel.length() / 2; i++) {
                // 각 위치마다 숫자 비교
                if ((pel.charAt(i)) == pel.charAt(pel.length() - i - 1)) {
                    if (i == (pel.length() / 2) - 1) {
                        sb.append("yes" + "\n");
                    }
                }
                // 같지 않다면 no
                else {
                    sb.append("no" + "\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
