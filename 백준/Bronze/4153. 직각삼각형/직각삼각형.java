import java.io.*;
import java.util.*;

// 피타고라스의 정리 c^2 = a^2 + b^2 

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 0 0 0이 들어올때 멈춰야 되므로
        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 세변을 입력받음
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            // b가 제일 긴 변일 때
            if(a < b && c < b){
                if(b * b == a * a + c * c){
                    sb.append("right" + "\n");
                }
                else{
                    sb.append("wrong" + "\n");
                }
            }

            // a가 제일 긴 변일 때
            if(b < a && c < a){
                if(a * a == b * b + c * c){
                    sb.append("right" + "\n");
                }
                else{
                    sb.append("wrong" + "\n");
                }
            }

            // c가 제일 긴 변 일 때
            if(a < c && b < c){
                if(c * c == a * a + b * b){
                    sb.append("right" + "\n");
                }
                else{
                    sb.append("wrong" + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
