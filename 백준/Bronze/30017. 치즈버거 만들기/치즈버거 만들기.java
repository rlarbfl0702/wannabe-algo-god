import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A > B){
            System.out.println(2 * B + 1);
        }
        else if(A < B){
            System.out.println(2 * A - 1);
        }
        else{
            System.out.println(2 * A - 1);
        }
    }
}
