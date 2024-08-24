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

        // 비교할 문자열
        String P = "I";

        for(int i = 1; i <= N; i++){
            P = P + "OI";
        }

        // 문자열 개수 카운트
        int cnt = 0;

        for(int i = 0; i <= (M - P.length()); i++){
            // 비교할 기준 문자열을 비교할 문자열 길이만큼 자름
            String cut = S.substring(i, i + P.length());

            // 만약 비교할 기준 문자열을 자른 것과
            // 비교 문자열이 같다면
            if(cut.equals(P)){
                // 카운트 + 1
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}
