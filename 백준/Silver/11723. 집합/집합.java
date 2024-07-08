import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("add")){
                int x = Integer.parseInt(st.nextToken());
                S[x] = true;
            }
            else if(command.equals("remove")){
                int x = Integer.parseInt(st.nextToken());
                S[x] = false;
            }
            else if(command.equals("check")){
                int x = Integer.parseInt(st.nextToken());
                sb.append(S[x] ? 1 : 0).append('\n');
            }
            else if(command.equals("toggle")){
                int x = Integer.parseInt(st.nextToken());
                S[x] = !S[x];
            }
            else if(command.equals("all")){
                Arrays.fill(S, true);
            }
            else{
                S = new boolean[21];
            }
        }
        System.out.println(sb);
    }
}
