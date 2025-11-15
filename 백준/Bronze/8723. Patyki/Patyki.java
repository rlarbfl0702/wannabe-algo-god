import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a, Math.max(b, c));

        if(max == a){
            if(a * a == (b * b + c * c)){
                System.out.println(1);
            }
            else{
                if((a == b) && (b == c)){
                    System.out.println(2);
                }
                else{
                    System.out.println(0);
                }
            }
        }
        else if(max == b){
            if(b * b == (a * a + c * c)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else if(max == c){
            if(c * c == (b * b + a * a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}