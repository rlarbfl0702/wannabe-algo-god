import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = 31;
        int M = 1_234_567_891;

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long hash = 0;
        for(int i=0; i<L; i++) {
            long tmp = str.charAt(i)-96;
            for(int j=0; j<i; j++) {
                tmp *= r;
                tmp %= M;
            }
            hash += tmp;
            hash %= M;
        }

        System.out.println(hash);
    }
}
