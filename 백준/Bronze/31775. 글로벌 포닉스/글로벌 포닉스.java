import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        String result = s1.split("")[0] + s2.split("")[0] + s3.split("")[0];

        if(result.equals("klp") || result.equals("kpl") || result.equals("lkp") || result.equals("lpk") || result.equals("pkl") || result.equals("plk")){
            System.out.println("GLOBAL");
        }
        else{
            System.out.println("PONIX");
        }
    }
}