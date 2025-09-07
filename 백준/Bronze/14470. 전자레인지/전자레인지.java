import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int time = 0;
        boolean isFrozen = A < 0;

        while (A != B) {
            if (A < 0) {
                time += A * C * -1;
                A=0;
            } else {
                if(isFrozen) {
                    time+=D;
                }
                time += (B - A) * E;
                break;
            }
        }

        System.out.println(time);
    }
}
