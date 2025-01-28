import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c = str.charAt(0);
        if(c == 'N' || c == 'n') {
            System.out.println("Naver D2");
        }
        else{
            System.out.println("Naver Whale");
        }

    }
}