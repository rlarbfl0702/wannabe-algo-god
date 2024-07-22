import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 문서의 개수
            int N = Integer.parseInt(st.nextToken());
            // 몇번째 문서의 출력 위치를 알고 싶은지
            int M = Integer.parseInt(st.nextToken());

            // 몇번째인지, 우선순위가 얼마인지 저장할 배열
            LinkedList<int[]> q = new LinkedList<>();

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            // 숫자를 입력받아서 배열과 stack에 넣음
            for(int i = 0; i < N; i++){
                int n = Integer.parseInt(st2.nextToken());

                // M번째 문서의 중요도가 뭔지 저장
                q.add(new int[]{i, n});
            }

            // 출력이 몇번째인지 저장할 변수
            int cnt = 0;

            while(true){
                // 맨 위에 숫자가 출력 숫자 출력하기 위해서
                int top[] = q.poll();

                // 더 높은 우선순위가 있는지 판별할 변수
                boolean isHigher = false;

                // q의 크기만큼 반복
                for(int i = 0; i < q.size(); i++){
                    // 만약 맨 위에 있는 문서의 우선순위보다
                    // 다른 문서의 우선순위가 더 높다면
                    if(q.get(i)[1] > top[1]){
                        // 맨 위에 빼낸 값을 다시 큐에 넣음
                        q.add(top);

                        // 맨 위에 있던 것을 다시 큐에 넣고
                        // i번째가 맨 위에 있던 것보다 우선순위가 더 높으므로
                        // i번째까지 모두 꺼내서 다시 뒤로 넣음
                        for(int j = 0; j < i; j++){
                            q.add(q.poll());
                        }

                        // 더 높은 것이 있으므로 true로 변환 후, 종료
                        isHigher = true;
                        break;
                    }
                }

                // 만약 더 높은 값이 없다면
                if(!isHigher){
                    // 출력 + 1
                    cnt = cnt + 1;

                    // 만약 맨위에 있던 문서의 번호와 출력순서를 알아야하는
                    // 문서의 번호가 같다면
                    if(top[0] == M){
                        // 출력 순서 출력 후, 종료
                        sb.append(cnt + "\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
