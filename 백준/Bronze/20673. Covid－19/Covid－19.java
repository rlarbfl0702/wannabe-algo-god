import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        if (c <= 50 && h <= 10) {
            System.out.println("White");
        } else if (h > 30) {
            System.out.println("Red");
        } else {
            System.out.println("Yellow");
        }
    }
}