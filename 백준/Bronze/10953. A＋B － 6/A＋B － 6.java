import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            String str = br.readLine();
            sb.append((str.charAt(0) - '0') + (str.charAt(2) - '0')).append('\n');
        }

        System.out.println(sb);
    }
}