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

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr, (n1, n2) -> {
            // y값을 기준으로 정렬 만약 비교하는 두 값이 같다면
            // x값을 기준으로 정렬
            if((n1[1] - n2[1]) == 0){
                return n1[0] - n2[0];
            }

            return n1[1] - n2[1];
        });

        for(int i = 0; i < N; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);
    }
}
