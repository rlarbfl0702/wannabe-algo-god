import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean cont = false;
        int score = 0;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(st.nextToken());
            if(s == 1) {
                if(cont) {
                    answer += ++score;
                }
                else {
                    cont = true;
                    answer += 1;
                    score = 1;
                }
            }
            else {
                cont = false;
                score = 0;
            }
        }
        System.out.println(answer);
    }
}
