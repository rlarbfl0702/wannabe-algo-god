import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());

        int score = N*10;
        if(N >= 3) {
            score+=20;
        }
        if(N == 5) {
            score+=50;
        }

        if(W > 1000) {
            score -= 15;
        }

        score = Math.max(score, 0);
        System.out.println(score);
    }
}
