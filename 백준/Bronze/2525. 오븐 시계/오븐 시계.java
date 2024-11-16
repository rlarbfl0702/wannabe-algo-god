import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        hour += (min+time)/60;
        min = (min+time)%60;

        if(hour > 23) {
            hour %= 24;
        }

        System.out.println(hour + " " + min);
    }
}