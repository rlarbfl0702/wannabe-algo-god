import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            // vps인지 판별할 문자열
            String vps = br.readLine();

            // 괄호가 맞게 들어오는지 판별할 변수
            int cnt = 0;

            for(int i = 0; i < vps.length(); i++){
                // 만약 여는 괄호가 들어온다면
                if(vps.charAt(i) == '('){
                    // 카운트 + 1
                    cnt = cnt + 1;
                }
                // 닫는 괄호가 들어온다면
                else if(vps.charAt(i) == ')'){
                    // 카운트 - 1
                    cnt = cnt - 1;
                }

                // 만약 카운트가 마이너스라면 괄호의 순서가 잘못됐다는 뜻이므로
                // 반복문 종료
                if(cnt < 0){
                    break;
                }
            }

            // 카운트가 0이면 순서와 개수가 모두 맞으므로 YES 출력
            if(cnt == 0){
                sb.append("YES" + "\n");
            }
            // 0이 아니라면 NO 출력
            else{
                sb.append("NO" + "\n");
            }
        }

        System.out.println(sb);
    }
}
