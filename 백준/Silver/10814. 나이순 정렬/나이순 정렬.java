import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 사람들 나이와 이름 저장 배열
        String people[][] = new String[N][2];

        // 입력받은 값을 배열에 저장
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            people[i][0] = st.nextToken();
            people[i][1] = st.nextToken();
        }

        // 나이를 기준으로 오룸차순 정렬
        // 뺐을 때 '-'면 n1이 더 작다는 의미로 n1이 n2 앞으로 가고
        // 뺐을 때 '+'면 n1이 더 크다는 의미이므로 n1이 n2보타 뒤로 감
        // 만약 0일 경우, 두 수가 같다는 의미이므로 변동이 없음
        Arrays.sort(people, (n1, n2) -> {
                return (Integer.parseInt(n1[0]) - Integer.parseInt(n2[0]));
        });

        for(int i = 0; i < N; i++){
            sb.append(people[i][0] + " " + people[i][1] + "\n");
        }

        System.out.println(sb);
    }
}
