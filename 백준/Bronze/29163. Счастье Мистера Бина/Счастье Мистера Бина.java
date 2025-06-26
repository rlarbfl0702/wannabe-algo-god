import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = 0;
        int j = 0;

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            if(n % 2 == 0){
                j = j + 1;
            }
            else{
                h = h + 1;
            }
        }

        if(j > h){
            System.out.println("Happy");
        }
        else{
            System.out.println("Sad");
        }
    }
}
