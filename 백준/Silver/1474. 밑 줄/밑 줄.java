import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 영어 단어 갯수
        int N = Integer.parseInt(st.nextToken());
        // 새로운 단어 길이
        int M = Integer.parseInt(st.nextToken());

        // 입력받은 영어 단어 총 갯수
        int word_cnt = 0;

        // 대문자로 시작하는 문자의 갯수
        int big = 0;

        // 소문자로 시작하는 문자의 갯수
        int small = 0;

        String words[] = new String[N];

        // 영단어를 배열에 저장하고 영단어의 길이를
        // 계속 더하면서 총 단어의 갯수를 계산
        for(int i = 0; i < N; i++){
            String s = br.readLine();

            words[i] = s;

            // 앞 글자 아스키코드
            int cap = (int)s.charAt(0);

            // 해당 아스키코드가 대문자에 해당하면 big + 1
            if(Character.isUpperCase(cap)){
                big = big + 1;
            }
            // 아니라면 small + 1
            else{
                small = small + 1;
            }

            word_cnt = word_cnt + s.length();
        }

        // 밑 줄이 필요한 갯수 계산
        int empty = M - word_cnt;
        // 밑 줄을 똑같이 나누면 몇 개 있어야되는지
        int empty_1 = empty / (N - 1);
        // 밑 줄을 똑같이 나누고 몇 개 남는지 (남는 만큼 똑같이 밑 줄을 더 넣어야되므로)
        int empty_2 = empty % (N - 1);

        if(Character.isLowerCase(words[0].charAt(0))){
            // 남은 소문자 갯수 - 1
            small = small - 1;
        }

        // 만약 소문자로 시작하는게 밑 줄을 똑같이 나누고 남은 것보다 많다면
        // 소문자 앞에만 밑 줄을 더 넣으면 됨
        if(small >= empty_2){
            for(int i = 0; i < N; i++){
                // 첫 문자면 그대로 출력
                if(i == 0){
                    sb.append(words[i]);
                }
                else{
                    // 해당 아스키코드가 소문자에 해당하면 평균 밑줄을 추가
                    if(Character.isLowerCase(words[i].charAt(0)) && empty_2 > 0){
                        for(int j = 0; j < empty_1 + 1; j++){
                            sb.append("_");
                        }
                        // 하나 더 출력하는 문자의 갯수를 - 1
                        empty_2 = empty_2 - 1;
                    }
                    // 대문자이거나 추가 밑줄을 다 출력했으면 평균 밑줄을 출력
                    else{
                        for(int j = 0; j < empty_1; j++){
                            sb.append("_");
                        }
                    }
                    sb.append(words[i]);
                }
            }
        }
        // 만약 소문자로 시작하는게 밑 줄을 똑같이 나누고 남은 것보다 적다면
        // 대문자, 소문자에 밑 줄을 더 넣어야 될 것을 구별해야됨
        else{
            // 대문자 앞에 있어야 될 밑 줄의 갯수
            int big_line = empty_2 - small;

            for(int i = 0; i < N; i++){
                // 첫 문자면 그대로 출력
                if(i == 0){
                    if(Character.isUpperCase(words[i].charAt(0))){
                        // 남은 대문자 갯수 - 1
                        big = big - 1;
                    }

                    sb.append(words[i]);
                }
                else{
                    // 해당 아스키코드가 대문자에 해당하면
                    if(Character.isUpperCase(words[i].charAt(0))){
                        // 만약 남은 대문자로 시작하는 문자열의 갯수가
                        // 밑 줄이 1개 더 추가되어야 하는 문자보다 많다면
                        // 평균대로 출력
                        if(big > big_line){
                            for(int j = 0; j < empty_1; j++){
                                sb.append("_");
                            }
                            // 대문자로 시작하는 문자열의 갯수를 - 1
                            big = big - 1;
                        }
                        // 작거나 같다면
                        // 1개 추가해서 출력
                        else{
                            for(int j = 0; j < empty_1 + 1; j++){
                                sb.append("_");
                            }
                            empty_2 = empty_2 - 1;
                        }
                    }
                    // 대문자가 아니라면 계속 밑줄을 하나씩 더 출력
                    else{
                        if(empty_2 > 0) {
                            for(int j = 0; j < empty_1 + 1; j++){
                                sb.append("_");
                            }
                            empty_2 = empty_2 - 1;
                        } else {
                            for(int j = 0; j < empty_1; j++){
                                sb.append("_");
                            }
                        }
                    }
                    sb.append(words[i]);
                }
            }
        }

        System.out.println(sb);
    }
}
