    import java.io.*;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int L = Integer.parseInt(br.readLine());
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine());
            int D = Integer.parseInt(br.readLine());

            int result1 = 0;
            int result2 = 0;

            if(A % C != 0){
                result1 = (A / C) + 1;
            }
            else{
                result1 = A / C;
            }

            if(B % D != 0){
                result2 = (B / D) + 1;
            }
            else{
                result2 = B / D;
            }

            if(result1 >= result2){
                System.out.println(L - result1);
            }
            else{
                System.out.println(L - result2);
            }
        }
    }