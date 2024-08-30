import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int result = 0;

        for(int i = 0; i < 3; i++){
            int n = Integer.parseInt(b.split("")[2 - i]);

            result = result + a * n * (int)Math.pow(10, i);

            sb.append(a * n + "\n");
        }

        sb.append(result + "\n");

        System.out.println(sb);
    }
}