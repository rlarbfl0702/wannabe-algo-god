import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        String M = st.nextToken();

        if(N.equals(M)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
