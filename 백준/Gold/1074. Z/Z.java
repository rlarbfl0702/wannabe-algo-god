import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열의 크기
        int N = Integer.parseInt(st.nextToken());
        // 행
        int r = Integer.parseInt(st.nextToken());
        // 열
        int c = Integer.parseInt(st.nextToken());

        // 2의 N제곱 구하기
        int num = (int)Math.pow(2, N);
        // 결과값
        int result = 0;

        // 크기가 1보다 크면 계속 반복
        while(num > 1){
            // 크기를 2로 계속 나눔 (사분면으로 분할하기 위해서)
            num = num / 2;

            // 행과 열이 2로 나눈 사이즈 숫자보다 작다면
            // 2사분면에 있다는 뜻
            if(r < num && c < num){
                // 결과값에 시작점의 숫자를 더함
                result = result + num * num * 0;
            }
            // 행이 사이즈보다 작고 열이 사이즈보다 크다면
            // 1사분면에 있다는 뜻
            else if(r < num && c >= num){
                result = result + num * num * 1;

                // 열의 크기를 현재 사이즈크기만큼 빼줌
                // 다시한번 작게 사분면을 나눠서 구분해야되므로
                c = c - num;
            }
            // 행이 사이즈보다 크고 열이 사이즈보다 작다면
            // 3사분면에 있다는 뜻
            else if(r >= num && c < num){
                result = result + num * num * 2;

                // 행의 크기를 현재 사이즈크기만큼 빼줌
                r = r - num;
            }
            // 행과 열이 사이즈보다 모두 크다면
            // 4사분면에 있다는 뜻
            else{
                result = result + num * num * 3;

                // 행과 열의 크기를 현재 사이즈만큼 빼줌
                c = c - num;
                r = r - num;
            }
        }

        System.out.println(result);
    }
}
