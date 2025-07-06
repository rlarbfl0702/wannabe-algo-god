import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int result = 60 * h + m;

        System.out.println(result);
    }
}
