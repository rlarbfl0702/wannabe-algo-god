import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c = str.charAt(0);

        if (c == 'F') {
            System.out.println("Foundation");
        } else if (c == 'C') {
            System.out.println("Claves");
        } else if (c == 'V') {
            System.out.println("Veritas");
        } else {
            System.out.println("Exploration");
        }
    }
}