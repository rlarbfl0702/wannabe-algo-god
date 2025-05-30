import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        int min = 0;
        int sec = 0;

        for(int i = 0; i < 4; i++){
            int T = Integer.parseInt(br.readLine());

            total = total + T;
        }

        min = total / 60;
        sec = total % 60;

        System.out.println(min);
        System.out.println(sec);

    }
}
