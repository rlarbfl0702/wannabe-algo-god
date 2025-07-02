import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for(int i = 0; i < 6; i++){
            int n = Integer.parseInt(st.nextToken());

            result = result + (n * 5);
        }

        System.out.println(result);
    }
}
