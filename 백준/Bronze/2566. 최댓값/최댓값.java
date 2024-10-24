import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int answer = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;

        for(int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num >= answer) {
                    answer = num;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(answer + "\n"+ (x+1) + " " + (y+1));
    }
}