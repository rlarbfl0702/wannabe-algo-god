import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M < 45){
            int m = 45 - M;

            if(H == 0){
                System.out.println(23 + " " + (60 - m));
            }
            else{
                System.out.println((H - 1) + " " + (60 - m));
            }
        }
        else{
            System.out.println(H + " " + (M - 45));
        }
    }
}