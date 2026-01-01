import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken()) / 2;
        int p = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(y, Math.min(c, p)));
    }
}