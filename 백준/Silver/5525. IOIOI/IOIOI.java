import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 반복되는 문자열 길이
        int N = Integer.parseInt(br.readLine());
        // 문자열 길이
        int M = Integer.parseInt(br.readLine());
        // 비교할 기준 문자열
        String S = br.readLine();

        // IOI 개수 카운트
        int cnt = 0;
        // 결과값
        int result = 0;

        // i-1, i, i+1번째 값이 IOI인지 비교하기 위한 반복문
        for(int i = 1; i < M - 1; i++){
            // i - 1번째가 I고 i번째가 O, i + 1번째가 I라면
            if((S.charAt(i - 1) == 'I') && (S.charAt(i) == 'O') && (S.charAt(i + 1) == 'I')){
                // IOI 개수 카운트 + 1
                cnt = cnt + 1;
                // 다음 IOI 패턴을 확인하기 위해서 i값을 증가시킴
                // 원래는 i++ 되면서 IOI패턴에서 i-1, i, i+1번째가 OIO가 되므로
                // 한번 더 증가시켜 주는 것
                i = i + 1;

                // 만약 찾은 IOI패턴이 찾아야되는 IOI패턴 길이와 같다면
                if(cnt == N){
                    // 결과값 + 1하고
                    result = result + 1;
                    // IOI패턴 카운트 한개를 빼줌
                    cnt = cnt - 1;
                }
            }
            // 만약 i-1, i, i+1이 IOI패턴이 아니라면
            else{
                // IOI패턴 개수를 0으로 초기화 시킴
                cnt = 0;
            }
        }

        System.out.println(result);
    }
}
