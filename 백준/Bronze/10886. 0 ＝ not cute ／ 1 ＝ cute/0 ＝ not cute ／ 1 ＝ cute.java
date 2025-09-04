import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int cnt0 = 0;
        int cnt1 = 0;

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                cnt0 = cnt0 + 1;
            }

            if(n == 1){
                cnt1 = cnt1 + 1;
            }
        }

        if(cnt0 > cnt1){
            System.out.println("Junhee is not cute!");
        }
        else{
            System.out.println("Junhee is cute!");
        }
    }
}
