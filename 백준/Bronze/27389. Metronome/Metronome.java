    import java.io.*;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            double N = Integer.parseInt(br.readLine());

            double result = N / 4;

            System.out.println(result);
        }
    }