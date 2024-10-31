import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n1 = st.nextToken();
        String n2 = st.nextToken();

        String num1 = "";
        String num2 = "";

        for(int i=n1.length()-1; i>=0; i--) {
            num1 += n1.charAt(i);
        }
        for(int i=n2.length()-1; i>=0; i--) {
            num2 += n2.charAt(i);
        }
        System.out.println(Math.max(Integer.parseInt(num1), Integer.parseInt(num2)));
    }
}