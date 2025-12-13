import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            if(i % 7 == 0 && i % 11 == 0){
                sb.append("Wiwat!" + "\n");
            }
            else if(i % 7 == 0){
                sb.append("Hurra!" + "\n");
            }
            else if(i % 11 == 0){
                sb.append("Super!" + "\n");
            }
            else{
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }
}