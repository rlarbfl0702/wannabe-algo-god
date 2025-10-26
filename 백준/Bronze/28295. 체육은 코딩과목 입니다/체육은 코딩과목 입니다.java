import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] answer = {'N', 'E', 'S', 'W'};
        int direction = 0;

        for(int i=0; i<10; i++) {
            int t = Integer.parseInt(br.readLine());
                if(t == 1){
                    direction++;
                }
                else if(t == 2) {
                    if(direction<2) {
                        direction += 2;
                    }
                    else {
                        direction -= 2;
                    }
                }
                else {
                    if(direction < 1) {
                        direction = 3;
                    }
                    else {
                        direction--;
                    }
                }
            direction %= 4;
        }
        System.out.println(answer[direction]);
    }
}