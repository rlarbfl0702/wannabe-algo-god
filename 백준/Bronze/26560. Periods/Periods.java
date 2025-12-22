import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            int len = s.length();

            if(s.split("")[len - 1].equals(".")){
                sb.append(s + "\n");
            }
            else{
                sb.append(s + "." + "\n");
            }
        }

        System.out.println(sb);
    }
}