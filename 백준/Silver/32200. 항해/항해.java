import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int meal = 0;
        int left = 0;
        int tmpMeal = 0;
        int tmpLeft = 0;

        for(int i=0; i<N; i++) {
            int size = Integer.parseInt(st.nextToken());
            // 길이를 충족시키지 못하면 나머지로 추가
            if(size < X) {
                left += size;
            }
            // 길이가 충분하다면
            else {
                tmpMeal = size/X;
                meal += tmpMeal;
                tmpLeft = size%X;
                left += Math.max(tmpLeft - (tmpMeal * (Y-X)), 0);

            }
        }
        System.out.println(meal);
        System.out.println(left);
        // 15 2~15
        // 개수: 7개
        // 나머지: 1-()


//        // 해결할 수 있는 끼니 개수
//        int day = 0;
//        // 버려지는 샌드위치 길이
//        int cut = 0;
//
//        // 샌드위치 길이 입력받기
//        for(int i = 0; i < N; i++){
//            int sand = Integer.parseInt(st2.nextToken());
//
//
//            // 만약 샌드위치 길이가 X이상 Y이하라면 끼니 + 1
//            if(sand >= X && sand <= Y){
//                day = day + 1;
//            }
//            // 만약 샌드위치 길이가 Y 초과라면 샌드위치를 자름
//            else if(sand > Y){
//                // 샌드위치를 최소 길이로 자르고 남은 길이
//                int l = sand - X;
//
//                // 남은 길이가 최소 길이보다 작다면 더 이상 자를 수 없으므로
//                // 버리는 샌드위치 길이를 줄여야되므로 최대 길이로
//                // 나눈 나머지를 더하고 끼니 개수 + 1
//                if(l < X){
//                    day = day + 1;
//                    cut = cut + (sand % Y);
//                }
//                // 만약 최소 길이로 자르고 남은 길이가 X보다 더 크다면
//                else{
//                    int a = Integer.MIN_VALUE;
//                    int b = Integer.MAX_VALUE;
//                    int len = 0;
//
//                    for(int j = X; j <= Y; j++){
//                        int x = sand / j;
//                        int y = sand % j;
//
//                        // 만약 몫이 기존 최대 몫보다 크다면 교체
//                        if(a < x){
//                            a = x;
//                            b = y;
//                            len = j;
//                        }
//                        // 만약 몫이 같다면 나머지가 적은 것으로 교체
//                        else if(a == x){
//                            if(b > y){
//                                b = y;
//                                len = j;
//                            }
//                        }
//                    }
//
//                    // 만약 남은 나머지를 나눠진 몫의 개수만큼 나눈 값을
//                    // 현재 샌드위치 길이에 더했을 때, 범위 내라면
//                    // 나머지를 0으로 만듦
//                    if(((b / a) + len) >= X && ((b / a) + len) <= Y){
//                        b = 0;
//                    }
//
//                    // 결정된 몫과 나머지를 기존 변수에 추가
//                    day = day + a;
//                    cut = cut + b;
//                }
//            }
//            // 만약 샌드위치의 길이가 X 미만이라면 버려지는 샌드위치 길이에 저장
//            else if(sand < X){
//                cut = cut + sand;
//            }
//        }
//
//        System.out.println(day);
//        System.out.println(cut);
    }
}
