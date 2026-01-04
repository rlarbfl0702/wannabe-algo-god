import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 0;
        int index = str.indexOf("DKSH");

        while (index != -1) {
            answer++;
            index = str.indexOf("DKSH", index + 4);
        }
        System.out.println(answer);
    }
}