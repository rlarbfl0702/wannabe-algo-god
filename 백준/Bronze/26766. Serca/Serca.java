import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            sb.append(" @@@   @@@ " + "\n");
            sb.append("@   @ @   @" + "\n");
            sb.append("@    @    @" + "\n");
            sb.append("@         @" + "\n");
            sb.append(" @       @ " + "\n");
            sb.append("  @     @  " + "\n");
            sb.append("   @   @   " + "\n");
            sb.append("    @ @    " + "\n");
            sb.append("     @     " + "\n");
        }

        System.out.println(sb);
    }
}
