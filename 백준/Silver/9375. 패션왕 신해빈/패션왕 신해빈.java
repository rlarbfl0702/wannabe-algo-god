import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        for(int test = 0; test < T; test++){
            long n = Integer.parseInt(br.readLine());

            // 옷 종류를 key값으로, 옷 이름을 value 값으로 저장
            HashMap<String, Integer> wear = new HashMap<>();

            if(n == 0){
                sb.append(0 + "\n");
            }
            else{
                for(int i = 0; i < n; i++){
                    StringTokenizer st = new StringTokenizer(br.readLine());

                    // 옷 이름
                    String name = st.nextToken();

                    // 옷 종류
                    String type = st.nextToken();

                    // 만약 hashmap에 입력받은 옷 종류를 key값으로 가지고 있다면
                    // 해당 옷 종류가 이미 한벌이상 들어왔다는 것이므로
                    // 그 옷 종류에 해당하는 value값에 1더해서 저장

                    // hashmap에 key값과 value값 저장
                    wear.put(type, wear.getOrDefault(type,0) + 1);
                }

                // 결과값을 저장할 변수
                int result = 1;

                // hashmap에 저장되어 있는 값들을 가지고 계산
                for(int i : wear.values()){
                    // 각 옷 종류마다 가질 수 있는 경우의 수를 곱해줌
                    // 각 옷 종유마다 가지고 있는 옷의 개수에
                    // 입지 않는다는 선택지도 있으니, 개수에 + 1을 해줌
                    result = result * (i + 1);
                }

                // 모든 옷을 입지 않으면 안되므로
                // 모두 입지 않는 경우를 뺌
                result = result - 1;

                sb.append(result + "\n");
            }
        }
        System.out.println(sb);
    }
}
