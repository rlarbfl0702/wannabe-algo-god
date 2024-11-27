import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;

        int result1 = 0;
        int result2 = 0;

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(i == 0){
                a1 = n1;
                a2 = n2;
            }
            else if(i == 1){
                b1 = n1;
                b2 = n2;
            }
            else{
                if(n1 == a1){
                    result1 = b1;
                }
                else if(n1 == b1){
                    result1 = a1;
                }
                else{
                    result1 = n1;
                }

                if(n2 == a2){
                    result2 = b2;
                }
                else if(n2 == b2){
                    result2 = a2;
                }
                else{
                    result2 = n2;
                }
            }
        }

        System.out.println(result1 + " " + result2);

    }
}
