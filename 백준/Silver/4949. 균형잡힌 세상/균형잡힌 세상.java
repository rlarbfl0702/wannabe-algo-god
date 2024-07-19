import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            // 입력되는 한 문장
            String s = br.readLine();

            // 문장의 길이
            int s_len = s.length();

            Stack<String> smb = new Stack<>();

            // 만약 문장의 시작이 길이와 같아졌을 때
            if(s_len == 1){
                // 만약 그 문장이 '.' 하나라면
                if(s.equals(".")){
                    // 종료
                    break;
                }
            }

            for(int i = 0; i < s_len; i++){
                //만약 소괄호 여는게 하나 있다면 스택테 s를 넣음
                if(s.charAt(i) == '('){
                    smb.add("s");
                }
                // 만약 소괄호 닫는게 하나 있다면 카운트에서 - 1
                else if(s.charAt(i) == ')'){
                    // 만약 스택이 비어있지 않다면
                    if(!smb.empty()){
                        String stk = smb.peek();

                        // 만약 최근에 들어온게 소괄호라면 닫는 순서가 맞으므로 pop
                        if(stk.equals("s")){
                            smb.pop();
                        }
                        else{
                            sb.append("no" + "\n");
                            break;
                        }
                    }
                    // 만약 비어있다면 여는게 없는데 닫는게 들어온 것이므로 반복문 종료
                    else{
                        sb.append("no" + "\n");
                        break;
                    }
                }
                // 만약 대괄호 여는게 하나 있다면 스택테 b를 넣음
                else if(s.charAt(i) == '['){
                    smb.add("b");
                }
                // 만약 대괄효 닫는게 하나 있다면
                else if(s.charAt(i) == ']'){
                    // 만약 스택이 비어있지 않다면
                    if(!smb.empty()){
                        String stk = smb.peek();

                        // 만약 최근에 들어온게 대괄호라면 닫는 순서가 맞으므로 pop으로 뺌
                        if(stk.equals("b")){
                            smb.pop();
                        }
                        // 아니라면 "no"출력
                        else{
                            sb.append("no" + "\n");
                            break;
                        }
                    }
                    // 만약 비어있다면 여는게 없는데 닫는게 들어온 것이므로 반복문 종료
                    else{
                        sb.append("no" + "\n");
                        break;
                    }
                }

                // 반복문의 마지막이 된다면
                if(i == (s_len - 1)){
                    if(smb.empty()){
                        sb.append("yes" + "\n");
                    }
                    // 만약 반복문이 끝나고 소괄호와 대괄호의 카운트가 0이 아니라면
                    // 남는게 있거나 순서가 잘못됐다는 뜻이므로 "no" 출력
                    else{
                        sb.append("no" + "\n");
                    }
                }

            }
        }

        System.out.println(sb);
    }
}
