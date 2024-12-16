import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        // 오리의 울음소리
        String sound = "quack";

        // 오리의 울음소리가 5의 배수일 경우,
        if(s.length() % 5 == 0){
            // 섞인 울음소리의 방문여부를 체크할 배열
            boolean visited[] = new boolean[s.length()];

            // 오리 수
            int cnt = 0;

            while(true){
                // 오리 울음소리의 순서
                int duck = 0;

                // 오리 울음소리가 연속인지 판단
                boolean TF = false;

                for(int i = 0; i < s.length(); i++) {
                    // 섞인 울음소리
                    char c = s.charAt(i);

                    // 이미 해당 위치를 방문했다면 continue
                    if (visited[i]) {
                        continue;
                    }

                    // 만약 섞인 현재 울음소리 문자와
                    // 오리 울음소리의 구성 문자의 현재 순서와 같다면
                    if (c == sound.charAt(duck)) {
                        // 비교할 오리의 울음소리 구성 문자의 순서를 + 1하고
                        duck = duck + 1;

                        // 해당 위치를 방문처리
                        visited[i] = true;

                        // 만약 오리 울음소리 위치가 4보다 크면
                        // 오리를 한마리 찾은 것이므로 오리 울음 위치를 0으로 초기화하고
                        // 오리를 찾은 의미로 TF를 true로 변환
                        if (duck > 4) {
                            duck = 0;
                            TF = true;
                        }
                    }
                }

                // 만약 오리를 하나도 찾지 못하고 TF가 false라면 반복문 종료
                if(!TF){
                    break;
                }

                // 오리를 찾았다면 오리 수 + 1
                cnt = cnt + 1;
            }

            // 방문 여부를 저장할 변수
            boolean valid = true;

            for(boolean i : visited){
                // 만약 방문하지 않은 부분이 하나라도 있다면
                // 녹음한 소리가 올바르지 않으므로
                // 방문 여부를 false로 바꿈
                if(!i){
                    valid = false;

                    break;
                }
            }

            if(!valid){
                System.out.println(-1);
            }
            else{
                System.out.println(cnt);
            }
        }
        // 오리의 울음소리가 5의 배수가 아니라면
        else{
            System.out.println(-1);
        }
    }
}
