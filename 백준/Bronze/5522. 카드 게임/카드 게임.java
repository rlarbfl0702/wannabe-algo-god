import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        for(int i = 0; i < 5; i++){
            int N = Integer.parseInt(br.readLine());

            result = result + N;
        }

        System.out.println(result);
    }
}