import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String answer = "==";
        if(A>B) {
            answer = ">";
        }
        else if(A<B) {
            answer = "<";
        }
        System.out.println(answer);
    }
}