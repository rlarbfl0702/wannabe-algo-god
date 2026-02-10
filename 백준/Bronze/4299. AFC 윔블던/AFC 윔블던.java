import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hap = Integer.parseInt(st.nextToken());
        int cha = Integer.parseInt(st.nextToken());

        for (int a = 0; a < 1000; a++) {
            for (int b = 0; b < 1000; b++) {
                if(a+b == hap) {
                    if (a - b == cha) {
                        System.out.println(a + " " + b);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}