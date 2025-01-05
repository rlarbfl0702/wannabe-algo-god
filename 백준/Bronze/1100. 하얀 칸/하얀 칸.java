import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        for(int i=0; i<8; i++) {
            String str = br.readLine();
            for(int j=0; j<8; j++) {
                if(i%2==0) {
                    if(j%2==0 && str.charAt(j) == 'F')
                        answer++;
                }
                else {
                    if(j%2==1 && str.charAt(j) == 'F') {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}