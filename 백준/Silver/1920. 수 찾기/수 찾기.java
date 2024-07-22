import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // A값들을 저장할 hashmap
        // key 값으로 value를 찾는 형식으로, 검색에 유용하기 때문
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력받은 값들을 hashmap에 key값과 value 값인 1을 저장
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            hash.put(n, 1);
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            // 찾을 값
            int n2 = Integer.parseInt(st2.nextToken());

            // getOrDefault는 hashmap에서 key값이 없을 때, null값을 출력하지 않고
            // default로 정해진 값을 출력함
            // hashmap에서 찾을 값이 key값으로 있다면 해당 value 값인 1을 저장
            // 없다면 0을 저장
            sb.append(hash.getOrDefault(n2, 0) + "\n");
        }

        System.out.println(sb);
    }
}
