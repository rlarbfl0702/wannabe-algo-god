import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String min_name = "";
        String max_name = "";

        int min_y = Integer.MAX_VALUE;
        int min_m = Integer.MAX_VALUE;
        int min_d = Integer.MAX_VALUE;

        int max_y = Integer.MIN_VALUE;
        int max_m = Integer.MIN_VALUE;
        int max_d = Integer.MIN_VALUE;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 제일 나이 많은 사람 구하기
            if(y < min_y){
                min_y = y;
                min_m = m;
                min_d = d;

                max_name = name;
            }
            else if(y == min_y){
                if(m < min_m){
                    min_m = m;
                    min_d = d;

                    max_name = name;
                }
                else if(m == min_m){
                    if(d < min_d){
                        min_d = d;

                        max_name = name;
                    }
                }
            }

            // 제일 나이 적은 사람 구하기
            if(y > max_y){
                max_y = y;
                max_m = m;
                max_d = d;

                min_name = name;
            }
            else if(y == max_y){
                if(m > max_m){
                    max_m = m;
                    max_d = d;

                    min_name = name;
                }
                else if(m == max_m){
                    if(d > max_d){
                        max_d = d;

                        min_name = name;
                    }
                }
            }
        }

        System.out.println(min_name);
        System.out.println(max_name);
    }
}
