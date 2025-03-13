import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int A = 0;
        int B = 0;

        if (s.length() == 4) {
            A = Integer.parseInt(s.substring(0, 2));
            B = Integer.parseInt(s.substring(2));
        }
        else if (s.length() == 3) {
            if (s.charAt(1) == '0') {
                A = Integer.parseInt(s.substring(0, 2));
                B = Integer.parseInt(s.substring(2));
            }
            else {
                A = Integer.parseInt(s.substring(0, 1));
                B = Integer.parseInt(s.substring(1));
            }
        }
        else {
            A = Integer.parseInt(s.substring(0, 1));
            B = Integer.parseInt(s.substring(1));
        }

        System.out.println(A + B);
    }
}
