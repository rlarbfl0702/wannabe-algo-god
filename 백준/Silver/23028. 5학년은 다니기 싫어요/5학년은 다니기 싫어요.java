import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = 8 - N;
        int total_m = Math.max(130 - B, 0);
        int pro_m = Math.max(66 - A, 0);

        for(int i = 1; i <= 10; i++){
            if(i > m){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
            }
            else{
                StringTokenizer st2 = new StringTokenizer(br.readLine());

                int X = Integer.parseInt(st2.nextToken());
                int Y = Integer.parseInt(st2.nextToken());

                // 아직 들어야되는 전공학점이 남았고
                if(pro_m > 0){
                    // 남은 전공 학점이 들을 수 있는 전공학점보다 적다면
                    // 0으로 초기화
                    if(pro_m < X * 3){
                        pro_m = 0;
                    }
                    else{
                        // 남은 전공학점이 더 크다면 들은 전공학점만큼 차감
                        pro_m = pro_m - (3 * X);
                    }
                }

                // 아직 들어야되는 총 학점이 남았다면
                if(total_m > 0){
                    // 남은 총 학점이 들을 수 있는 학점보다 적다면
                    // 0으로 초기화
                    if(total_m < 3 * Math.min(6, X + Y)){
                        total_m = 0;
                    }
                    else{
                        // 남은 총학점이 더 크다면
                        // 해당학기의 전공 수업과 비전공 수업의 개수를 더한 과목 수와 6을 비교해서
                        // 작은 숫자만큼 학점을 곱해서 차감 (최대 들을 수 있는 과목의 수가 6이기 때문)
                        total_m = total_m - 3 * Math.min(6, X + Y);
                    }
                }
            }
        }

        if(pro_m == 0 && total_m == 0){
            System.out.println("Nice");
        }
        else{
            System.out.println("Nae ga wae");
        }
    }
}
