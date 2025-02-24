    import java.io.*;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int T1 = Integer.parseInt(st.nextToken());
            int T2 = Integer.parseInt(st.nextToken());

            if(T1 <= T2){
                System.out.println(T1);
            }
            else{
                System.out.println(T2);
            }
        }
    }