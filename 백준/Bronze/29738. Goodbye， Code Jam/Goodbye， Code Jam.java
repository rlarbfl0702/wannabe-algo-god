import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            int N = Integer.parseInt(br.readLine());

            if(N > 4500){
                sb.append("Case " + "#" + i + ": Round " + 1 + "\n");
            }
            else if(N > 1000){
                sb.append("Case " + "#" + i + ": Round " + 2 + "\n");
            }
            else if(N > 25){
                sb.append("Case " + "#" + i + ": Round " + 3 + "\n");
            }
            else{
                sb.append("Case " + "#" + i + ": World Finals" + "\n");
            }
        }

        System.out.println(sb);
    }
 }