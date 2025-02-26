    import java.io.*;
    import java.util.*;

    public class Main{
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            char c = br.readLine().charAt(0);

            if(c == 'M'){
                System.out.println("MatKor");
            }
            else if(c == 'W'){
                System.out.println("WiCys");
            }
            else if(c == 'C'){
                System.out.println("CyKor");
            }
            else if(c == 'A'){
                System.out.println("AlKor");
            }
            else if(c == '$'){
                System.out.println("$clear");
            }
        }
    }