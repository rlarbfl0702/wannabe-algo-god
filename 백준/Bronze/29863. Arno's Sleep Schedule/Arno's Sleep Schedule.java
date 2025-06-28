import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int result = 0;

        if(s <= 23 && s >= 20){
            result = 24 - s;

            result = result + f;
        }
        else{
            result = f - s;
        }

        System.out.println(result);
    }
}
