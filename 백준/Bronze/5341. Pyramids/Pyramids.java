    import java.io.*;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            while(true) {
                int input = Integer.parseInt(br.readLine());
                if(input == 0) {
                    break;
                }

                int tmp = 0;
                for(int i=1; i<=input; i++) {
                    tmp += i;
                }
                sb.append(tmp).append('\n');
            }

            System.out.println(sb);
        }
    }