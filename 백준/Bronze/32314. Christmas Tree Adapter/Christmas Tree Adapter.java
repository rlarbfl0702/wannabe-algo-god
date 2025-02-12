import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if(N <= (w / v)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}