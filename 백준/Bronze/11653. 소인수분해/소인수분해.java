import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if(N > 1){
            boolean prime[] = new boolean[N + 1];

            prime[0] = true;
            prime[1] = true;

            for(int i = 2; i <= N; i++){
                if(!prime[i]){
                    for(int j = i * 2; j <= N; j = j + i){
                        prime[j] = true;
                    }
                }
            }

            for(int i = 2; i <= N; i++){
                if(N == 1){
                    break;
                }

                while(true){
                    if(N % i == 0){
                        N = N / i;

                        sb.append(i + "\n");
                    }
                    else{
                        break;
                    }
                }
            }

            System.out.println(sb);

        }
    }
}
