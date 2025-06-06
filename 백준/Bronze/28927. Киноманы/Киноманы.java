import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        int mel = 0;

        int t1 = Integer.parseInt(st.nextToken());
        int e1 = Integer.parseInt(st.nextToken());
        int f1 = Integer.parseInt(st.nextToken());

        max = (3 * t1) + (20 * e1) + (120 * f1);

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int t2 = Integer.parseInt(st2.nextToken());
        int e2 = Integer.parseInt(st2.nextToken());
        int f2 = Integer.parseInt(st2.nextToken());

        mel = (3 * t2) + (20 * e2) + (120 * f2);

        if(max > mel){
            System.out.println("Max");
        }
        else if(max < mel){
            System.out.println("Mel");
        }
        else{
            System.out.println("Draw");
        }
    }
}
