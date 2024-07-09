import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        int num = 0;

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("add")){
                int x = Integer.parseInt(st.nextToken())-1;
                num |= 1 << x;
            }
            else if(command.equals("remove")){
                int x = Integer.parseInt(st.nextToken())-1;
                num &= ~(1 << x);
            }
            else if(command.equals("check")){
                int x = Integer.parseInt(st.nextToken())-1;
                sb.append((num & 1 << x) == 1 << x ? 1 : 0).append('\n');
            }
            else if(command.equals("toggle")){
                int x = Integer.parseInt(st.nextToken())-1;
                boolean flag = (num & 1 << x) == 1 << x;
                if(flag){
                    num &= ~(1 << x);
                }
                else{
                    num |= 1 << x;
                }
            }
            else if(command.equals("all")){
                num = ~( 1 << 22 );
            }
            else{
                num = 0;
            }
        }
        System.out.println(sb);
    }
}
