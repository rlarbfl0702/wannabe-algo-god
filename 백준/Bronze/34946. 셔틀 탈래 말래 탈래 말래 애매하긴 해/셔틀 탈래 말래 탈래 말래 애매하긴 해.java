import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        boolean TF = false;
        boolean TF2 = false;

        if(A + B <= D){
            TF = true;
        }

        if(C <= D){
            TF2 = true;
        }

        if(TF && TF2){
            System.out.println("~.~");
        }
        else if(!TF && !TF2){
            System.out.println("T.T");
        }
        else if(TF && !TF2){
            System.out.println("Shuttle");
        }
        else if(!TF && TF2){
            System.out.println("Walk");
        }
    }
}