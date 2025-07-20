import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int apple = 0;
        int banana = 0;

        for(int i = 3; i >= 1; i--){
            int n = Integer.parseInt(br.readLine());

            apple = apple + (n * i);
        }

        for(int i = 3; i >= 1; i--){
            int n = Integer.parseInt(br.readLine());

            banana = banana + (n * i);
        }

        if(apple > banana){
            System.out.println("A");
        }
        else if(apple < banana){
            System.out.println("B");
        }
        else{
            System.out.println("T");
        }
    }
}
