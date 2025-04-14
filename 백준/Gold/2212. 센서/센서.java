import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 센서의 개수
        int N = Integer.parseInt(br.readLine());
        // 집중국의 개수
        int K = Integer.parseInt(br.readLine());

        // 센서의 거리를 저장할 배열
        int sensor[] = new int[N];
        // 센서간의 거리를 저장할 배열
        int d[] = new int[N - 1];

        // 결과값
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int s = Integer.parseInt(st.nextToken());

            sensor[i] = s;
        }

        // 센서의 거리를 오름차순으로 정렬
        Arrays.sort(sensor);

        for(int i = 0; i < N - 1; i++){
            // 센서간의 거리를 저장
            d[i] = sensor[i + 1] - sensor[i];
        }

        // 센서간의 거리를 오름차순으로 정렬
        Arrays.sort(d);

        // 집중국을 세울 수록 센서간의 구간이 필요없어짐
        // 따라서 집중국을 K개 세우면 (K - 1)개의 센서간의 구간을
        // 센서간의 길이가 큰 수부터 잘라냄
        // ex) 집중국은 최소 1개이므로 집중국이 1개일 때 모든 센서간의 거리를 더해야하고
        // 세울 수 있는 집중국이 2개일 경우, 센서간의 길이가 제일 큰 부분을 잘라서
        // 그 경계에 집중국을 세우면 2개가 됨
        // 따라서 센서간의 길이가 N - 1개 이고
        // 여기에 K개의 집중국을 세우면 (K - 1)개의 센서간의 길이를 잘라내야 하므로
        // (N - 1) - (K - 1) = N - 1 - K + 1 = N - K개 만큼
        // 센서간의 거리들을 더하면 됨 (오름차순으로 정렬했으므로)
        for(int i = 0; i < N - K; i++){
            result = result + d[i];
        }

        System.out.println(result);
    }
}

