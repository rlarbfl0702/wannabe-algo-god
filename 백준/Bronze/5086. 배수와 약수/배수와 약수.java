import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.MAX_VALUE;
        int M = Integer.MAX_VALUE;

        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if((N == 0) && (M == 0)){
                break;
            }

            if(N > M){
                if(N % M == 0){
                    sb.append("multiple" + "\n");
                }
                else{
                    sb.append("neither" + "\n");
                }
            }
            else{
                if(M % N == 0){
                    sb.append("factor" + "\n");
                }
                else{
                    sb.append("neither" + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
