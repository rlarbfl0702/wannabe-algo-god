import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ch[] = {1, 1, 2, 2, 2, 8};
        int result[] = new int[6];

        String s = br.readLine();

        for(int i = 0; i < 6; i++){
            int n = Integer.parseInt(s.split(" ")[i]);

            result[i] = ch[i] - n;
        }

        for(int i = 0; i < 6; i++){
            System.out.print(result[i] + " ");
        }
    }
}