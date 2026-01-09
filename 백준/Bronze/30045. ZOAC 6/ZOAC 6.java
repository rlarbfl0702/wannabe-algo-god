import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            if(s.contains("01") || s.contains("OI")){
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);
    }
}