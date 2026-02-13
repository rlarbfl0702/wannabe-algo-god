import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer sb = new StringTokenizer(br.readLine());

        int sum = 0;

        while(sb.hasMoreTokens()){
            int N = Integer.parseInt(sb.nextToken());
            sum += N;
        }

        System.out.println(sum);
    }
 }