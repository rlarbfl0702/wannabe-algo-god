import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            // 함수 모음
            String s = br.readLine();

            // 수의 개수
            int n = Integer.parseInt(br.readLine());

            // 수를 입력할 Deque
            Deque<Integer> q = new LinkedList<>();

            String arr = br.readLine();

            // 입력받은 문자열에서 문자를 빼고 숫자만 저장
            // 숫자빼고 모든 것을 기준으로 구준
            // 문자열의 시작이 숫자가 아닐 경우, 빈 문자열이 들어옴
            // 만약, 앞 뒤가 둘다 숫자로 시작하지 않을 경우
            // 앞 뒤 다 빈 문자열로 들어옴
            String num[] = arr.split("[^0-9]+");

            // 숫자로 변환해서 Deque에 저장하는데
            for(String i : num){
                // 들어오는 값이 빈 문자열이 아닐 경우에만 저장
                if(!i.isEmpty()){
                    int x = Integer.parseInt(i);

                    q.offer(x);
                }
            }

            // 뒤집는지 아닌지 판별한 변수
            // false일 경우 앞, true일 경우 뒤
            boolean FB = false;

            // 에러의 여부
            boolean err = false;

            // 명령어 길이만큼 반복
            for(int i = 0; i < s.length(); i++){
                // 명령어 저장
                char c = s.charAt(i);

                // 만약 명령어가 R이면 뒤집는 것이므로
                // FB를 반대값으로 변환
                if(c == 'R'){
                    FB = !FB;
                }

                // 만약 명령어가 D라면 수를 하나 빼는 것이므로
                // 숫자의 수를 1로 줄임
                if(c == 'D'){
                    n = n - 1;

                    // 수의 개수가 0보다 작아지면 더 이상 뺄 수 없다는
                    // 뜻이므로 에러여부를 true로 바꾸고 반복문 종료
                    if(n < 0){
                        err = true;
                        break;
                    }

                    // FB가 false이고 만약 명령어가 D라면 앞에서부터 수 제거
                    if(!FB){
                        q.pollFirst();
                    }
                    // FB가 true이고 만약 명령어가 D라면 뒤에서부터 수 제거
                    else{
                        q.pollLast();
                    }
                }
            }

            // 만약 에러가 발생했다면 error를 저장하고
            if(err){
                sb.append("error");
            }
            // 아니라면 Deque에 남아있는 숫자를 저장
            else{
                sb.append("[");

                // 만약 FB가 false이면
                if(!FB){
                    // 출력 숫자 세는 것
                    int cnt = 0;
                    // 앞에서부터 수 저장
                    for(int i : q){
                        sb.append(i);

                        // 출력된 숫자 + 1
                        cnt = cnt + 1;

                        // 만약 출력된 숫자가 Deque에 있는 숫자들을
                        // 다 저장했다면 ",'를 저장하지 않음
                        if(cnt != q.size()){
                            sb.append(",");
                        }
                    }
                }
                // 만약 fB가 true이면
                else{
                    // 출력 숫자 세는 것
                    int cnt = 0;
                    // 뒤에서부터 수 저장
                    for (Iterator<Integer> it = q.descendingIterator(); it.hasNext();) {
                        int i = it.next();
                        sb.append(i);

                        // 출력된 숫자 + 1
                        cnt = cnt + 1;

                        // 만약 출력된 숫자가 Deque에 있는 숫자들을
                        // 다 저장했다면 ",'를 저장하지 않음
                        if(cnt != q.size()){
                            sb.append(",");
                        }
                    }
                }
                sb.append("]");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
