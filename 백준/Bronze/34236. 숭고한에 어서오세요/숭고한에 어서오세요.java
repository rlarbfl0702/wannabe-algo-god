import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        int d = Integer.parseInt(st.nextToken());
        boolean TF = false;

        for(int i = 1; i < N; i++){
            result = Integer.parseInt(st.nextToken());

            if(!TF){
                d = result - d;
                TF = true;
            }
        }

        System.out.println(result + d);
    }
}