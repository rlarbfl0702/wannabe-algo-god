import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int B;
    static int ground[][];
    static int result;
    static int result2;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 열
        N = Integer.parseInt(st.nextToken());
        // 행
        M = Integer.parseInt(st.nextToken());
        // 땅의 개수
        B = Integer.parseInt(st.nextToken());

        // 땅의 높이를 저장할 배열
        ground = new int[N][M];
        // 초를 저장할 변수
        result = Integer.MAX_VALUE;
        // 땅의 높이를 저장할 변수
        result2 = 0;

        // 배열에 값 저장
        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                int n = Integer.parseInt(st2.nextToken());

                ground[i][j] = n;
            }
        }

        for(int h = 0; h <= 256; h++){
            // 시간초를 계산할 변수
            int s = 0;
            // 남은 블럭 수
            int b = B;

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(ground[i][j] > h){
                        int height = ground[i][j] - h;

                        // 기준 땅보다 현재 땅 높이가 높으므로 남은 땅 수에 더해줌
                        b = b + height;

                        // 블럭을 제거하여 인벤토리에 넣었으므로 넣은 블록 수 * 2초
                        s = s + 2*height;
                    }
                    else if(ground[i][j] < h){
                        int height = h - ground[i][j];

                        // 기준 땅보다 현재 땅 높이가 낮으므로 남은 땅 수에 빼줌
                        b = b - height;

                        // 블럭을 좌표에 넣어서 넣은 블록 수 * 1초
                        s = s + height;
                    }
                }
            }

            // 블럭수가 0개보다 크고 계산된 초가 결과값보다 작거나 같다면
            // 결과초와 땅 높이를 갱신
            if(b >= 0 && s <= result){
                result = s;
                result2 = h;
            }
        }

        System.out.println(result + " " + result2);
    }
}
