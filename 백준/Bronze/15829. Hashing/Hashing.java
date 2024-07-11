import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        // 해시 값 저장할 배열
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>(26);

        int cnt = 1;
        // 소문자 아스키코드가 97 ~ 122
        // 아스키코드마다 해시함수 값 저장
        for(int i = 97; i <= 122; i++){
            hash.put(i, cnt);
            cnt = cnt + 1;
        }

        int hash_cnt = 0;
        long result = 0;

        for(int i = 0; i < s.length(); i++){
            // i번째 문자를 아스키코드로 변환
            int c = (int)s.charAt(i);

            // 변환한 아스키코드를 key 값으로 해당 해시 값인 value를 찾음
            int h = hash.get(c);

            long po = 1;
            // 해시 값 * 31^(숫자 해당 순번(0부터 시작)
            for(int j = 0; j < hash_cnt; j++){
                // 31을 계속 곱해준 후, 오버플로우가 나는 것을 방지하기 위해
                // 1234567891로 나눈 나머지
                po = (po * 31) % 1234567891;
            }

            // 나온 31 제곱값과 해시 값을 곱해줌
            po = h * po;

            // 더한수도 오버플로우가 날 수 있으므로 1234567891로 나눠줌
            result = (result + po) % 1234567891;

            // 숫자 순번 + 1
            hash_cnt = hash_cnt + 1;
        }

        System.out.println(result);
    }
}
