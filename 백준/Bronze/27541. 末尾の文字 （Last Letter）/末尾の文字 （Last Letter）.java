import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        if(s.charAt(N - 1) == 'G'){
            System.out.println(s.substring(0, N - 1));
        }
        else{
            System.out.println(s + "G");
        }
    }
}