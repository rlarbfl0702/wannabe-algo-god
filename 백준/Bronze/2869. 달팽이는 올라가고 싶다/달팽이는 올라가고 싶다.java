import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 마지막 날은 무조건 오르므로 미리 계산
        int day = 1;
        int len = V - A;

        // 그래도 높이가 남는다면 추가되는 날 계산
        if(len > 0){
            // 하루에 올라갈 수 있는 최대 높이로 나누어 걸리는 일 수를 계산
            if(len % (A-B) == 0){
                day += len / (A-B);
            }
            // 완벽히 나누어 떨어지지 않으면 하루가 더 필요함
            else{
                day += len / (A-B) + 1;
            }
        }

        System.out.println(day);
    }
}
