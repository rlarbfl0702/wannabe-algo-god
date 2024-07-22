import java.io.*;
import java.util.*;

public class Main {
    static long max;
    static long result;
    static int K;
    static int N;
    static int lans[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 가지고 있는 랜선 개수
        K = Integer.parseInt(st.nextToken());
        // 필요한 랜선 개수
        N = Integer.parseInt(st.nextToken());

        // 랜선 저장 배열
        lans = new int[K];

        // 최댓값을 저장할 변수
        max = Integer.MIN_VALUE;

        for(int i = 0; i < K; i++){
            int l = Integer.parseInt(br.readLine());

            // 배열에 저장
            lans[i] = l;

            // 최댓값이 입력받은 수보다 크다면
            // 입력받은 수를 최솟값으로 갱신
            if(l > max){
                max = l;
            }
        }

        // 결과값을 저장할 변수
        result = 0;

        cutting(1, max);

        System.out.println(result);
    }

    // 랜선 자르는 함수
    public static void cutting(long s, long l){
        if(l - s < 0){
            return;
        }

        // 랜선의 길이를 (시작점 + 끝점)/2를 해줌
        long len = (s + l) / 2;

        // 자른 랜선의 개수
        long cnt = 0;

        // 반복문을 통해 랜선들을 잘라서 몇개 나오는지 더함
        for(int j = 0; j < K; j++){
            cnt = cnt + (lans[j] / len);
        }

        // 만약 자른 랜선들의 개수가 필요한 랜선 개수보다 크거나 같다면
        if(cnt >= N){
            // 중간값과 끝점을 기준으로 다시 함수를 돌림
            result = len;
            cutting(len + 1, l);
        }
        // 만약 개수가 작다면 랜선의 길이가 더 작아야된다는 뜻이므로
        else{
            // 시작점과 중간점을 기준으로 다시 함수를 돌림
            cutting(s, len - 1);
        }
    }
}
