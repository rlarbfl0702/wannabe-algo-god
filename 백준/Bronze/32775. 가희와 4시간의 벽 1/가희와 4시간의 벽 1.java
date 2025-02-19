    import java.io.*;
    import java.time.LocalDate;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int S = Integer.parseInt(br.readLine());
            int F = Integer.parseInt(br.readLine());

            if(S <= F){
                System.out.println("high speed rail");
            }
            else if(S > F){
                System.out.println("flight");
            }
        }
    }