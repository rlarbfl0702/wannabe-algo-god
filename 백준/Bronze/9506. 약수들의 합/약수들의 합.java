import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == -1){
                break;
            }

            boolean num[] = new boolean[n + 1];

            int result = 0;

            for(int i = 1; i < n; i++){
                if(n % i == 0){

                    result = result + i;

                    num[i] = true;
                }
            }

            if(result == n){

                String s = n + " =";

                for(int i = 1; i < n; i++){
                    if(num[i]){
                        s = s + " " + i + " +";
                    }
                }

                int idx = s.length();
                s = s.substring(0, idx - 1);

                sb.append(s + "\n");
            }
            else{
                sb.append(n + " is NOT perfect." + "\n");
            }
        }

        System.out.println(sb);
    }
}
