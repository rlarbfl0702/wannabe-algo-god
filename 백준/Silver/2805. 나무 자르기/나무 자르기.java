import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int max;
    static int trees[];
    static long result;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 나무의 수
        N = Integer.parseInt(st.nextToken());
        // 필요한 나무의 길이
        M = Integer.parseInt(st.nextToken());

        // 최댓값
        max = Integer.MIN_VALUE;

        trees = new int[N];

        // 높이 최댓값 결과
        result = 0;

        StringTokenizer st2  = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            // 최댓값 갱신
            if(n > max){
                max = n;
            }

            // 나무 길이 배열에 저장
            trees[i] = n;
        }

        DFS(0, max);

        System.out.println(result);
    }

    public static void DFS(long s, long f){
        // 시작 길이가 끝 길이보다 길어지면 종료
        if(s > f){
            return;
        }

        // 나무 개수 카운트 변수
        long cnt = 0;

        // 자를 나무 길이
        // 길이를 시작점과 끝점의 중간지점으로 설정
        long len = (f + s)/2;

        for(int i = 0; i < N; i++){
            // 나무를 자르고 남은 길이를 저장할 변수
            long minus = 0;

            // 배열에 저장되어있는 나무길이에 자를 나무길이를 빼줌
            minus = trees[i] - len;

            // 만약 뺀 길이가 음수라면 해당 나무는 해당 길이로 자를 수 없다는
            // 뜻이므로 0으로 다시 저장
            if(minus < 0){
                minus = 0;
            }

            // 전체 남은 나무 길이에 해당 남은 나무 길이를 저장
            cnt = cnt + minus;
        }

        // 만약 남은 나무 길이가 필요한 나무 길이보다 같거나 크다면
        // 자르는 나무 길이를 더 길게 해도 된다는 뜻이므로
        if(cnt >= M){
            // 결과값을 현재 나무 길이로 저장해주고
            result = len;
            // 시작 지점을 중간 길이 + 1로 설정
            DFS(len + 1, f);
        }
        // 만약 남은 나무 길이가 필요한 나무 길이보다 작으면
        // 자르는 나무 길이가 더 짧아야되므로
        else if(cnt < M){
            // 끝 지점을 중간 길이 - 1로 설정
            DFS(s, len - 1);
        }
    }
}
