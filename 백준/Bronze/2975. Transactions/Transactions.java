import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int M = Integer.parseInt(st.nextToken());

            if((N == 0) && (s.equals("W")) && (M == 0)){
                break;
            }

            if(s.equals("W")){
                if(N - M < -200){
                    sb.append("Not allowed" + "\n");
                }
                else{
                    sb.append(N - M +  "\n");
                }
            }
            else if(s.equals("D")){
                sb.append(N + M +"\n");
            }
        }

        System.out.println(sb);
    }
}
