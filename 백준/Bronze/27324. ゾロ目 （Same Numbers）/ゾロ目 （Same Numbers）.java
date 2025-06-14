import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if((N / 10) == (N % 10)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
