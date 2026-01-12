import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String s = st.nextToken();

        if(s.equals("miss")){
            System.out.println(0);
        }
        else if(s.equals("bad")){
            System.out.println(200 * N);
        }
        else if(s.equals("cool")){
            System.out.println(400 * N);
        }
        else if(s.equals("great")){
            System.out.println(600 * N);
        }
        else if(s.equals("perfect")){
            System.out.println(1000 * N);
        }
    }
}