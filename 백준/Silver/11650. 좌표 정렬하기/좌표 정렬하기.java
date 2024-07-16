import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 좌표 값 저장할 배열
        int arr[][] = new int[N][2];

        // 입력 값을 배열에 저장
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 정렬 알고리즘
        Arrays.sort(arr, (n1, n2) -> {
            // 만약 x좌표의 값이 같다면
            if((n1[0] - n2[0]) == 0){
                // y좌표 값을 비교해서 정렬
                return n1[1] - n2[1];
            }

            // 아니라면 x좌표 값으로 정렬
            return n1[0] - n2[0];
        });

        for(int i = 0; i < N; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);
    }
}
