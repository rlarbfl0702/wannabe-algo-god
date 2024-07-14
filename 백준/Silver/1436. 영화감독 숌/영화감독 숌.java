import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 몇번째인지 세는 변수
        int cnt = 0;
        int result = 0;

        for(int i = 666; i < Integer.MAX_VALUE; i++){
            String s = i + "";

            if(s.contains("666")){
                cnt = cnt + 1;
            }

            if(cnt == N){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
