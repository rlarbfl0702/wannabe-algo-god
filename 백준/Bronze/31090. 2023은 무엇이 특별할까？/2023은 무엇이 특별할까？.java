import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int year = Integer.parseInt(br.readLine());
            int tmp = year%100;
            if ((year + 1)%tmp == 0) {
                sb.append("Good");
            }
            else {
                sb.append("Bye");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}