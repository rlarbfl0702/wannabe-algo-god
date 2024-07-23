import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 비밀번호가 있는 사이트 주소 개수
        int N = Integer.parseInt(st.nextToken());

        // 구해야되는 사이트 개수
        int M = Integer.parseInt(st.nextToken());

        // 사이트의 주소와 비밀번호를 저장할 hashmap
        HashMap<String, String> sites = new HashMap<>();

        // 사이트의 주소와 비밀번호를 입력받음
        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            // 사이트 주소
            String url = st2.nextToken();

            // 비밀번호
            String password = st2.nextToken();

            // hashmap에 사이트 주소는 key, 비밀번호는 value로 저장
            sites.put(url, password);
        }

        // 비밀번호를 찾을 사이트의 주소를 입력받음
        for(int i = 0; i < M; i++){
            // 사이트 주소
            String s = br.readLine();

            sb.append(sites.get(s) + "\n");
        }

        System.out.println(sb);
    }
}
