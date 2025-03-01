    import java.io.*;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            int result = 0;
            int result2 = 0;
            int result3 = 0;

            for(int i = 1; i <= N; i++){
                result = result + i;
                result3 = result3 + (i * i * i);
            }

            result2 = result * result;

            System.out.println(result);
            System.out.println(result2);
            System.out.println(result3);
        }
    }