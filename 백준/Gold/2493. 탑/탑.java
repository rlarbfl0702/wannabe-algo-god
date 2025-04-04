import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 탑의 순서와 탑의 높이를 stack에 저장
        Stack<int[]> s = new Stack<>();

        for(int i = 1; i <= N; i++){
            int n = Integer.parseInt(st.nextToken());

            // stack이 비지 않았고 stack에 저장된
            // 탑의 정보 중 탑의 높이가 현재 탑의 높이보다 작다면
            while(!s.isEmpty() && s.peek()[1] < n){
                // 해당 탑의 정보를 반복적으로 빼냄
                s.pop();
            }

            // 만약 stack이 비어있다면, 수신할 탑이 없다는 뜻이므로
            // 결과값에 0을 넣음
            if(s.isEmpty()){
                sb.append(0 + " ");
            }
            // 만약 stack이 비지 않았다면, 수신할 탑이 있다는 뜻이므로
            else{
                // stack의 제일 위에 있는 탑의 정보가 현재 탑과
                // 가장 가까운 높이가 같거나 높은 탑이므로
                // 해당 탑의 높이를 결과값에 저장
                sb.append(s.peek()[0] + " ");
            }

            // 그리고 현재 탑의 높이 정보를 stack에 저장
            s.push(new int[]{i, n});
        }

        System.out.println(sb);
    }
}
