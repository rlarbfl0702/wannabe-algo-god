import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int chin = 1;
        int bin = 1;
        for (int i = 0; i < N; i++) {
            chin += A;
            bin += B;
            if(chin < bin) {
                int tmp = chin;
                chin = bin;
                bin = tmp;
            }
            else if(chin == bin) {
                bin--;
            }
        }
        System.out.println(chin + " " + bin);
    }
}