import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        if(N >= 3 && M <= 4){
            sb.append("TroyMartian" + "\n");
        }

        if(N <= 6 && M >= 2){
            sb.append("VladSaturnian" + "\n");
        }

        if(N <= 2 && M <= 3){
            sb.append("GraemeMercurian");
        }

        System.out.println(sb);
    }
}
