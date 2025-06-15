import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        int az = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int cx = Integer.parseInt(st2.nextToken());
        int cy = Integer.parseInt(st2.nextToken());
        int cz = Integer.parseInt(st2.nextToken());

        int two = 0;

        if(ay >= cy){
            two = ay / cy;
        }
        else if(ay < cy){
            two = cy / ay;
        }

        System.out.println(Math.abs(az - cx) + " " + two + " " + Math.abs(ax - cz));
    }
}
