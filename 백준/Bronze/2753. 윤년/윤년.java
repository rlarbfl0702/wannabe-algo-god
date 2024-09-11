import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Y = Integer.parseInt(br.readLine());

        if((Y % 4 == 0) && (Y % 100 != 0)){
            System.out.println(1);
        }
        else if((Y % 4 == 0) && (Y % 400 == 0)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}