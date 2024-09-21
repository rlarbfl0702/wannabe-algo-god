import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int maxNum = Integer.MIN_VALUE;
        int answer = 0;

        for(int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > maxNum) {
                maxNum = num;
                answer = i+1;
            }
        }

        System.out.println(maxNum);
        System.out.println(answer);
    }
}