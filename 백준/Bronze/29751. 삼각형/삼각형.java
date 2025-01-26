import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double W = Integer.parseInt(st.nextToken());
        double H = Integer.parseInt(st.nextToken());

        double result = (W * H) / 2;

        System.out.println(result);
    }
}