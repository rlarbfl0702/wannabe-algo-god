import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 1;
        int tmp = 1;
        int i = 1;
        while(N > tmp) {
            tmp += 6*i;
            i++;
            answer++;
        }
        System.out.println(answer);
    }
}
