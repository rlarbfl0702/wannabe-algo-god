import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String result = "";

        for(int i = 0; i < s.length(); i++){
            char alp = s.charAt(i);

            if(Character.isUpperCase(alp)){
                result = result + s.split("")[i].toLowerCase();
            }
            else if(Character.isLowerCase(alp)){
                result = result + s.split("")[i].toUpperCase();
            }
        }

        System.out.println(result);
    }
}
