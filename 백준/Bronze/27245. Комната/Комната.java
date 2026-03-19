import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        int v1 = Math.min(w, l) / h;
        int v2 = Math.max(w, l) / Math.min(w, l);

        if(v1 >= 2 && v2 <= 2){
            System.out.println("good");
        }
        else{
            System.out.println("bad");
        }
    }
}