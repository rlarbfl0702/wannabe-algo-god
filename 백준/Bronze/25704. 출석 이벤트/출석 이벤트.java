import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        double[] c = new double[4];

        c[0] = Math.max(P - 500, 0);
        c[1] = P*0.9;
        c[2] = Math.max(P - 2000, 0);
        c[3] = P*0.75;
        double answer = 0;

        if(N >= 20) {
            answer = Math.min(Math.min(Math.min(c[3], c[2]), c[1]), c[0]);
        }
        else if(N >= 15) {
            answer = Math.min(Math.min(c[2], c[1]), c[0]);
        }
        else if(N >= 10) {
            answer = Math.min(c[1], c[0]);
        }
        else if(N >= 5) {
            answer = c[0];
        }
        else {
            answer = P;
        }
        System.out.println((int)answer);
    }
}