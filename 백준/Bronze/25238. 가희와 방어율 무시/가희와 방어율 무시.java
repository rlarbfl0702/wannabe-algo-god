import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());

        double result = (A * (100 - B)) / 100;

        if(result >= 100){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
