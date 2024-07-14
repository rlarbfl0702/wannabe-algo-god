import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int answer = 666;
        while(cnt != N) {
            answer++;
            int check = 0;
            int number = answer;
            while(number != 0) {
                if(number%10 == 6) {
                    check++;
                }
                else{
                    check = 0;
                }
                if(check == 3) {
                    cnt++;
                    break;
                }
                number /= 10;
            }
        }
        System.out.println(answer);
    }
}
