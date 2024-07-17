import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        while(true) {
            if(N%5==0) {
                answer += N/5;
                N %= 5;
            }
            if(N < 2) {
                break;
            }
            N -= 3;
            answer++;
        }
        if(N != 0) {
            answer = -1;
        }
        System.out.println(answer);
    }
}
