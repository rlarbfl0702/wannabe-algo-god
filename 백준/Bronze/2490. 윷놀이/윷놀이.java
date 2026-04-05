import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int result = 0;
            for (int j = 0; j < 4; j++) {
                if (Integer.parseInt(st.nextToken()) == 0) {
                    result++;
                }
            }
            switch (result) {
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
            }
        }

    }
}