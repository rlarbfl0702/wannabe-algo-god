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
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            // i번째 문자를 아스키코드로 변환
            int c = (int)s.charAt(i);

            // 변환한 아스키코드를 key 값으로 해당 해시 값인 value를 찾음
            int h = hash.get(c);

            // 해시 값 * 31^(숫자 해당 순번(0부터 시작))
            result = result + (h * (int)Math.pow(31, hash_cnt));

            // 숫자 순번 + 1
            hash_cnt = hash_cnt + 1;
        }

        System.out.println(result);
    }
}
