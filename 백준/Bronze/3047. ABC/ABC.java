import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int C = Math.max(a, Math.max(b, c));
        int B = 0;
        int A = Math.min(a, Math.min(b, c));

        if(a != C && a != A){
            B = a;
        }
        else if(b != C && b != A){
            B = b;
        }
        else{
            B = c;
        }

        String s = br.readLine();

        for(int i = 0; i < 3; i++){
            String N = s.split("")[i];

            if(N.equals("A")){
                sb.append(A + " ");
            }
            else if(N.equals("B")){
                sb.append(B + " ");
            }
            else{
                sb.append(C + " ");
            }
        }

        System.out.println(sb);

    }
}
