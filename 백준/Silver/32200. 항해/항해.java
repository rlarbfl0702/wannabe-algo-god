import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        // 해결할 수 있는 끼니 개수
        int day = 0;
        // 버려지는 샌드위치 길이
        int cut = 0;

        // 샌드위치 길이 입력받기
        for(int i = 0; i < N; i++){
            int sand = Integer.parseInt(st2.nextToken());

            // 만약 샌드위치의 길이가 최소 길이보다 작다면
            // 버려지는 샌드위치 길이에 추가
            if(sand < X){
                cut = cut + sand;
            }
            // 만약 최소 길이보다 작지 않다면
            else{
                // 샌드위치를 최소 길이로 나눈 몫을
                int d = sand / X;
                // 끼니 수에 더함 
                // (먹을 수 있는 끼니의 수는 최대여야 하므로 최소길이로 나눈 몫을 더해줌)
                day = day + d;
                // 버리는 샌드위치의 길이는 최소여야되므로 
                // 현재 샌드위치로 먹을 수 있는 최대 끼니 수 * 최대 길이를 샌드위치 길이에서 빼줌
                sand = sand - (d * Y);
                
                // 만약 위에서 계산한 샌드위치의 길이가 0보다 크다면
                // 최대 길이로 모두 잘라먹어도 남는다는 뜻이므로
                // 버려지는 샌드위치 길이에 더해줌
                // (0보다 작을 경우, 샌드위치를 자르는 길이 범위내에서 조합하여 커버할 수 있다는 뜻이므로
                // 남는 샌드위치 길이는 0이 되기 때문)
                if(sand > 0){
                    cut = cut + sand;
                }
            }
        }

        System.out.println(day);
        System.out.println(cut);
    }
}
