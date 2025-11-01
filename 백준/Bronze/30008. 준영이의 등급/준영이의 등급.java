import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < K; i++){
            int D = Integer.parseInt(st2.nextToken());

            int P = (D * 100) / N;

            if(P >= 0 && P <= 4){
                sb.append(1 + " ");
            }
            else if(P > 4 && P <= 11){
                sb.append(2 + " ");
            }
            else if(P > 11 && P <= 23){
                sb.append(3 + " ");
            }
            else if(P > 23 && P <= 40){
                sb.append(4 + " ");
            }
            else if(P > 40 && P <= 60){
                sb.append(5 + " ");
            }
            else if(P > 60 && P <= 77){
                sb.append(6 + " ");
            }
            else if(P > 77 && P <= 89){
                sb.append(7 + " ");
            }
            else if(P > 89 && P <= 96){
                sb.append(8 + " ");
            }
            else if(P > 96 && P <= 100){
                sb.append(9 + " ");
            }
        }

        System.out.println(sb);
    }
}