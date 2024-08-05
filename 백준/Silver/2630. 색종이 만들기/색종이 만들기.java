import java.io.*;
import java.util.*;

public class Main {

    static int N;

    static int paper[][];

    static int b_cnt;
    static int w_cnt;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 변의 길이
        N = Integer.parseInt(br.readLine());

        // 색종이가 칠해진 모양
        paper = new int[N][N];

        // 파란색 종이 카운트
        b_cnt = 0;

        // 하얀색 종이 카운트
        w_cnt = 0;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++){
                int n = Integer.parseInt(st.nextToken());

                // 종이의 값을 저장하는 배열  에 종이색 저장
                paper[i][j] = n;
            }
        }

        DFS(0, 0, N);

        System.out.println(w_cnt);
        System.out.println(b_cnt);
    }


    static public void DFS(int l, int k, int S){
        // 정사각형으로 자를 수 있는지 여부 판단 변수
        boolean TF = true;

        for(int i = l; i < l + S; i++){
            for(int j = k; j < k + S; j++){
                // 만약 종이의 시작부분과 해당 부분의 값이 같지 않다면
                if(paper[i][j] != paper[l][k]){
                    // 해당 크기의 정사각형은 흰색, 파란색으로 나뉘지 않는다는
                    // 뜻이므로 false로 바꾸고 반복문 종료
                    TF = false;
                    break;
                }
            }
            if(!TF){
                break;
            }
        }
        // 만약 해당 크기의 정사각형을 한 색깔로 칠할 수 있다면
        // 해당 정사각형의 시작부분의 숫자를 확인 후,
        // 흰색이나 파란색 카운트 + 1
        if(TF){
            // 숫자가 1이라면 파란색 + 1
            if(paper[l][k] == 1){
                b_cnt = b_cnt + 1;
            }
            // 숫자가 0이라면 흰색 + 1
            else if(paper[l][k] == 0){
                w_cnt = w_cnt + 1;
            }
        }
        // 해당 크기의 정사각형으로 자를 수 없다면 2분의 1길이로 잘라서
        // 다시 DFS를 돌림
        else if(!TF){
            int newS = S / 2;
            // 2사분면
            DFS(l, k, newS);
            // 1사분면
            DFS(l, k + newS, newS);
            // 3사분면
            DFS(l + newS, k, newS);
            // 4사분면
            DFS(l + newS, k + newS, newS);
        }
    }
}
