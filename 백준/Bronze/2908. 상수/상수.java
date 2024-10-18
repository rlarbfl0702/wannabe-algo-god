import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String n1 = st.nextToken();
        String n2 = st.nextToken();

        String chn1 = "";
        String chn2 = "";

        for(int i = 0; i < 3; i++){
            chn1 = chn1 + n1.split("")[2 - i];
            chn2 = chn2 + n2.split("")[2 - i];
        }

        if(Integer.parseInt(chn1) > Integer.parseInt(chn2)){
            System.out.println(chn1);
        }
        else{
            System.out.println(chn2);
        }
    }
}