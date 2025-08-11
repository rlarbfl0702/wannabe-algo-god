import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
            else{
                map.put(s, 1);
            }
        }

        int size = map.size();

        // 팔린 책의 갯수
        int max = Integer.MIN_VALUE;
        // 결과 책 제목
        String result = "";

        for(Map.Entry<String, Integer> m : map.entrySet()){
            String s = m.getKey();
            int n = m.getValue();

            if(max < n){
                result = s;
                max = n;
            }
            else if(max == n){
                if(s.compareTo(result) < 0){
                    // s가 사전순으로 더 앞이면
                    result = s;
                }
            }
        }

        System.out.println(result);
    }
}
