import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        boolean TF = false;

        for(int i = 0; i < 10; i++){
            int N = Integer.parseInt(br.readLine());

            // 아직 100에 가까운 수를 못 찾았을 경우만 비교
            if(!TF){
                int plus = total + N;

                // 만약 다음 값을 최종 값에 더한 값이 100에 더 가깝다면
                // 최종값을 갱신
                if(Math.abs(100 - plus) <= Math.abs(100 - total)){
                    total = plus;
                }
                // 만약 다음 값을 더한 값과 현재 최종값을 100과 비교했을때
                // 둘 다 똑같이 가까운 수라면 다음 값을 더한 값을
                // 최종값으로 갱신하고 100에 가까운 수를 찾았다고 표시
                else if(Math.abs(100 - plus) == Math.abs(100 - total)){
                    total = plus;

                    TF = true;
                }
                // 만약 다음 값을 더한 값이 현재 최종값보다 100에 더 멀다면
                // 다음 값들은 안더해줘도 되므로 TF를 true로 변환
                else if(Math.abs(100 - plus) >= Math.abs(100 - total)){
                    TF = true;
                }
            }
        }

        System.out.println(total);
    }
}
