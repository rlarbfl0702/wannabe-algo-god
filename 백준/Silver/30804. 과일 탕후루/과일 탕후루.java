import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과일의 개수
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 과일을 넣어줄 배열
        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            arr[i] = n;
        }

        // 과일의 개수 최댓값을 저장할 변수
        int max = Integer.MIN_VALUE;
        // 시작점
        int s = 0;
        // 과일의 종류를 저장할 HashMap (과일의 종류와 개수를 저장)
        HashMap<Integer, Integer> fruits = new HashMap<>();

        // 끝정
        for(int i = 0; i < N; i++){
            // 현재 과일을 과일 종류에 추가하고
            // 만약 해당 과일이 없다면 0에 1을 추가하고
            // 기존에 있다면 기존 값에 1을 더해서 저장함
            fruits.put(arr[i], fruits.getOrDefault(arr[i], 0) + 1);

            // 과일의 종류가 2개 초과가 된다면
            while(fruits.size() > 2){
                // 앞에서부터 없애야하므로
                // 시작점의 과일 개수를 1개 줄임
                fruits.put(arr[s], fruits.get(arr[s]) - 1);

                // 만약 시작점 과일의 종류 개수가 0이 된다면
                // 해당 과일의 종류를 HashMap에서 제거
                if(fruits.get(arr[s]) == 0){
                    fruits.remove(arr[s]);
                }

                // 시작점을 증가시킴
                s = s + 1;
            }

            // 현재 최대값과 (끝점 - 시작점 + 1)한 크기와 비교해서
            // 더 큰 값을 최대값으로 갱신
            max = Math.max(max, i - s + 1);
        }

        System.out.println(max);
    }
}
