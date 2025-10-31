import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long R = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        long result = 0;

        result = ((R + N - 1) / N) * ((C + N - 1) / N);

        System.out.println(result);
    }
}