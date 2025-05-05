import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = N + "";

        if(((N % 7) != 0) && (!s.contains("7"))){
            System.out.println(0);
        }
        else if(((N % 7) == 0) && (!s.contains("7"))){
            System.out.println(1);
        }
        else if(((N % 7) != 0) && (s.contains("7"))){
            System.out.println(2);
        }
        else if(((N % 7) == 0) && (s.contains("7"))){
            System.out.println(3);
        }
    }
}
