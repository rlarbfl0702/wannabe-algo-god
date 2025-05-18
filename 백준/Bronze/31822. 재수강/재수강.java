import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String code = br.readLine();
        int answer = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String tmp = br.readLine();
            boolean flag = true;
            for(int j=0; j<5; j++) {
                if (code.charAt(j) != tmp.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
