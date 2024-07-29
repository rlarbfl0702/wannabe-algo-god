import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수의 개수
        int N = Integer.parseInt(st.nextToken());

        // 합을 구해야 하는 구간 수
        int M = Integer.parseInt(st.nextToken());

        // 구간의 합을 저장할 배열
        int sum[] = new int[N + 1];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 구간들의 합을 구할 변수
        int s = 0;

        for(int i = 1; i <= N; i++){
            int n = Integer.parseInt(st2.nextToken());

            // 구간합을 구하기 위해서 i번째 배열에
            // i번째까지 숫자들의 합을 저장
            s = s + n;

            sum[i] = s;
        }

        // 구간합의 개수만큼 반복
        for(int i = 0; i < M; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());

            // 시작점
            int start = Integer.parseInt(st3.nextToken());

            // 끝점
            int end = Integer.parseInt(st3.nextToken());

            // 구간의 합은 끝점까지 더한 값과 시작점 전까지 더한 값을
            // 빼는 것과 같으므로 sum[end] - sum[start - 1]을 출력
            sb.append(sum[end] - sum[start - 1] + "\n");
        }

        System.out.println(sb);
    }
}
