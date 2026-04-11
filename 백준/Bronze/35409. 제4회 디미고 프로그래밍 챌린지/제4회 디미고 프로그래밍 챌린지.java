import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int crit = h*100 + m;
        String answer = "";

        if ((crit >= 630 && crit <= 900) ||
                (crit >= 950 && crit <= 1000) ||
                (crit >= 1050 && crit <= 1100) ||
                (crit >= 1150 && crit <= 1200) ||
                (crit >= 1250 && crit <= 1350) ||
                (crit >= 1440 && crit <= 1450) ||
                (crit >= 1540 && crit <= 1550) ||
                (crit >= 1640 && crit <= 2250)
        ) {
            answer = "Yes";
        } else answer = "No";

        System.out.println(answer);
    }
}