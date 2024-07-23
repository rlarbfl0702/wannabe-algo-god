import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수
        int N = Integer.parseInt(br.readLine());

        // 사람들의 시간을 저장할 배열
        int people[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 시간을 입력받아 저장
        for(int i = 0; i < N; i++){
            int t = Integer.parseInt(st.nextToken());

            people[i] = t;
        }

        // 시간이 적을수록 먼저하는게 최솟값을 구하는 방법이므로
        // 오름차순으로 정렬
        Arrays.sort(people);

        // 결과값 저장할 변수
        int result = 0;

        // 앞에 값들을 더한 변수
        // 계속해서 더해야하므로 저장해놓음
        int sum = 0;

        // 정렬된 시간들을 순서대로 더해줌
        for(int i = 0; i < N; i++){
            sum = sum + people[i];

            result = result + sum;
        }

        System.out.println(result);
    }
}
