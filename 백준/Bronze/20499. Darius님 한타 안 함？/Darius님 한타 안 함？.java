import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int kda[] = new int[3];

        for(int i = 0; i < 3; i++){
            int n = Integer.parseInt(s.split("/")[i]);

            kda[i] = n;
        }

        int result = kda[0] + kda[2];
        int d = kda[1];

        if(d == 0 || (result < d)){
            System.out.println("hasu");
        }
        else{
            System.out.println("gosu");
        }
    }
}
