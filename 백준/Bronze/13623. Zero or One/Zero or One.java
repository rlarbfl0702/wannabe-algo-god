import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B){
            if(B == C){
                System.out.println("*");
            }
            else{
                System.out.println("C");
            }
        }
        else if(A == C){
            if(C == B){
                System.out.println("*");
            }
            else{
                System.out.println("B");
            }
        }
        else if(B == C){
            if(B == A){
                System.out.println("*");
            }
            else{
                System.out.println("A");
            }
        }
    }
}