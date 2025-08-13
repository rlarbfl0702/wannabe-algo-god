import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arr[] = new int[8];
        int copy[] = new int[8];
        boolean num[] = new boolean[8];

        for(int i = 0; i < 8; i++){
            int n = Integer.parseInt(br.readLine());

            arr[i] = n;
            copy[i] = n;
        }

        // 오름차순으로 정렬
        Arrays.sort(arr);

        // 총 점수
        int total = 0;

         for(int i = 3; i < 8; i++){
             int n = arr[i];

             total = total + n;

             for(int j = 0; j < 8; j++){
                 // 상위 다섯문제와 점수가 같다면 해당 순번이
                 // 상위 문제이므로 해당 순번을 true로 변환
                 if(n == copy[j]){
                     num[j] = true;

                     break;
                 }
             }
         }

         for(int i = 0; i < 8; i++){
             if(num[i]){
                 sb.append(i + 1 + " ");
             }
         }

         System.out.println(total);
         System.out.println(sb);
    }
}
