import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int Ca = Integer.parseInt(st.nextToken());
        int Ba = Integer.parseInt(st.nextToken());
        int Pa = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int Cr = Integer.parseInt(st2.nextToken());
        int Br = Integer.parseInt(st2.nextToken());
        int Pr = Integer.parseInt(st2.nextToken());

        int result = 0;

        if(Ca < Cr){
            result = result + (Cr - Ca);
        }

        if(Ba < Br){
            result = result + (Br - Ba);
        }

        if(Pa < Pr){
            result = result + (Pr - Pa);
        }

        System.out.println(result);
    }
}