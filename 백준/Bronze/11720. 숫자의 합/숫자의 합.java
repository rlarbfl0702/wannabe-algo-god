import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int num = 0;
        for(int i=0; i<N; i++) {
            num += str.charAt(i) - '0';
        }
        System.out.println(num);
    }
}