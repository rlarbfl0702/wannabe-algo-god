import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()) * 7;
        int P = Integer.parseInt(st.nextToken()) * 13;

        if(A > P){
            System.out.println("Axel");
        }
        else if(A < P){
            System.out.println("Petra");
        }
        else{
            System.out.println("lika");
        }


    }
}