import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i = 0; i < T; i++){
            String s = br.readLine();

            if(s.equals("Poblano")){
                result = result + 1500;
            }
            else if(s.equals("Mirasol")){
                result = result + 6000;
            }
            else if(s.equals("Serrano")){
                result = result + 15500;
            }
            else if(s.equals("Cayenne")){
                result = result + 40000;
            }
            else if(s.equals("Thai")){
                result = result + 75000;
            }
            else if(s.equals("Habanero")){
                result = result + 125000;
            }
        }

        System.out.println(result);
    }
}