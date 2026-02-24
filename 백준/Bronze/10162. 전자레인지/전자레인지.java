import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        cnt = cnt + N / 300;

        sb.append(N / 300 + " ");

        N = N % 300;

        cnt = cnt + N / 60;

        sb.append(N / 60 + " ");

        N = N % 60;

        cnt = cnt + N / 10;

        sb.append(N / 10 + " ");

        N = N % 10;

        if(N == 0){
            System.out.println(sb);
        }
        else{
            System.out.println(-1);
        }
    }
}