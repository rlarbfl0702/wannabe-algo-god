import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int apple = Integer.parseInt(br.readLine());
        int tang = Integer.parseInt(br.readLine());

        System.out.println(apple + tang + 3);
    }
}
