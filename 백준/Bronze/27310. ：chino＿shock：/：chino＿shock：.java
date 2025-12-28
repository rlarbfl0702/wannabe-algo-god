import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int colon = 0;
        int uBar = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ':') {
                colon++;
            }
            else if(str.charAt(i) == '_') {
                uBar++;
            }
        }
        System.out.println(str.length() + colon + uBar*5);

    }
}