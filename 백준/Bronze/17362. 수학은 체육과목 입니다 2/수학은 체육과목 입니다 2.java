import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = n%8;
        if(result == 1) {
            System.out.println(1);
        }
        else if(result == 2 || result == 0) {
            System.out.println(2);
        }
        else if(result == 3 || result == 7) {
            System.out.println(3);
        }
        else if(result == 4 || result == 6) {
            System.out.println(4);
        } else if (result == 5) {
            System.out.println(5);
        }
    }
}