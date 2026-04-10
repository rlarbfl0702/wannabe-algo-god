import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int one_1 = Integer.parseInt(st.nextToken());
        int one_2 = Integer.parseInt(st.nextToken());
        int one_3 = Integer.parseInt(st.nextToken());

        int one = one_1 + (one_2 * 2) + (one_3 * 3);

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int two_1 = Integer.parseInt(st2.nextToken());
        int two_2 = Integer.parseInt(st2.nextToken());
        int two_3 = Integer.parseInt(st2.nextToken());

        int two = two_1 + (two_2 * 2) + ( two_3 * 3);

        if(one > two){
            System.out.println(1);
        }
        else if(one < two){
            System.out.println(2);
        }
        else{
            System.out.println(0);
        }
    }
}