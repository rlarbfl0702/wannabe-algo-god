import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int B = Integer.parseInt(br.readLine());
        int tmp = 5*B-400;
        int answer = Integer.compare(100, tmp);
        System.out.println(tmp);
        System.out.println(answer);
    }
}