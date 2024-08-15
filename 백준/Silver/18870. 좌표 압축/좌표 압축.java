import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 좌표 개수
        int N = Integer.parseInt(br.readLine());

        // 좌표값을 넣을 배열
        int arr[] = new int[N];

        // 좌표값을 정렬할 treeset(중복값을 제외하기 위해)
        TreeSet<Integer> arr2 = new TreeSet<>();

        // 좌표값과 압축 좌표값을 저장할 Hashmap
        HashMap<Integer, Integer> graph = new HashMap<>();

        // 결과값을 저장할 배열
        int result[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열에 좌표값을 저장
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());

            arr[i] = x;
            arr2.add(x);
        }

        // 순서
        int cnt = 0;

        // 정렬한 배열을 treeset의 값을 key로, 순서를 value로 hashmap에 저장
        for(int i : arr2){
            graph.put(i, cnt);

            // 순서 + 1
            cnt = cnt + 1;
        }

        for(int i = 0; i < arr.length; i++){
            // 결과값에 배열의 값을 이용하여 hashmap에 저장되어있는 value값을 저장
            result[i] = graph.get(arr[i]);
        }

        for(int i = 0; i < result.length; i++){
            sb.append(result[i] + " ");
        }

        System.out.println(sb);
    }
}
