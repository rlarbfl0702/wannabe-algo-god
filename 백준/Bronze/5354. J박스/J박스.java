import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());

            if(N == 1){
                sb.append("#");
                sb.append("\n");
                sb.append("\n");
            }
            else if(N == 2){
                sb.append("##" + "\n");
                sb.append("##" + "\n");
                sb.append("\n");
            }
            else{
                for(int j = 0; j < N; j++){
                    sb.append("#");
                }

                sb.append("\n");

                for(int j = 0; j < N - 2; j++){
                    sb.append("#");

                    for(int k = 0; k < N - 2; k++){
                        sb.append("J");
                    }

                    sb.append("#");

                    sb.append("\n");
                }

                for(int j = 0; j < N; j++){
                    sb.append("#");
                }

                sb.append("\n");
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
