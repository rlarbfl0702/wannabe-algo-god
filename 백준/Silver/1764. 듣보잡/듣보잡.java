import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 듣도 보도 못한 사람의 수
        int N = Integer.parseInt(st.nextToken());

        // 보도 못한 사람의 수
        int M = Integer.parseInt(st.nextToken());

        // 듣도 보도 못한 사람을 저장할 배열
        HashMap<String, String> no_l = new HashMap<>();

        // 듣도 보도 못한 사람을 저장할 배열
        List<String> result = new ArrayList<>();

        // 듣도 보도 못한 사람들을 입력받아 배열에 저장
        for(int i = 0; i < N; i++){
            String s = br.readLine();

            no_l.put(s, "1");
        }

        // 보도 못한 사람들을 입력받은 뒤,
        // 듣도 보도 못한 사람을 저장한 배열에 있으면 결과 배열에 저장
        for(int i = 0; i < M; i++){
            String s = br.readLine();

            if(no_l.containsKey(s)){
                result.add(s);
            }
        }

        // 정렬하기
        Collections.sort(result);

        sb.append(result.size() + "\n");

        for(int i = 0; i < result.size(); i++){
            sb.append(result.get(i) + "\n");
        }

        System.out.println(sb);
    }
}
