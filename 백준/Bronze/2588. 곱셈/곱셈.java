import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        sb.append(n1 * (n2%10)).append('\n').append(n1 * (n2/10%10)).append('\n').append(n1 * (n2/100%10)).append('\n').append(n1*n2).append('\n');
        System.out.println(sb);
    }
}