import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 사이즈가 6개 이므로, 크기를 6으로 지정 S, M, L, XL, XXL, XXXL
        int size[] = new int[6];

        // 각 사이즈마다 필요한 숫자 기록
        for(int i = 0; i < 6; i++){
            size[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 티셔츠 사이즈를 T장씩 묶음으로 주문
        int T = Integer.parseInt(st2.nextToken());
        // 펜을 P자루씩 묶음으로 주문
        int P = Integer.parseInt(st2.nextToken());

        // 티셔츠를 몇 묶음으로 주문해야되는지에 대한 변수
        int t_count = 0;
        // 펜을 P자루씩 최대 몇묶음으로 주문할 수 있는지에 대한 변수
        int ps_count = 0;
        // 펜은 남거나 모자라서 안되기 때문에 묶음으로 주문하고난 후, 필요한 펜 수
        int p_count = 0;

        for(int i = 0; i < 6; i++){
            // 사이즈마다 필요한 갯수에서 한 묶음당 있는 티셔츠 숫자를 빼,
            // 필요한 묶음 수 계산
            while(true){
                if(size[i] > 0){
                    size[i] = size[i] - T;
                    t_count = t_count + 1;
                }

                if(size[i] <= 0){
                    break;
                }
            }
        }

        // 필요한 펜 묶음은 전체에서 한 묶음의 개수를 나눈 몫
        ps_count = N / P;
        // 필요한 낱개 펜은 전체에서 한 묶음의 개수를 나눈 나머지
        p_count = N % P;

        System.out.println(t_count);
        System.out.println(ps_count + " " + p_count);
    }
}