    import java.io.*;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            if(N % 3 == 1){
                System.out.println("U");
            }
            else if(N % 3 == 2){
                System.out.println("O");
            }
            else if(N % 3 == 0){
                System.out.println("S");
            }
        }
    }