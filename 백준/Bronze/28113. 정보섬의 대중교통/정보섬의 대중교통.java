    import java.io.*;
    import java.time.LocalDate;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            if(B < (S - N) + N){
                System.out.println("Bus");
            }
            else if(B > (S - N) + N){
                System.out.println("Subway");
            }
            else if(B == (S - N) + N){
                System.out.println("Anything");
            }
        }
    }