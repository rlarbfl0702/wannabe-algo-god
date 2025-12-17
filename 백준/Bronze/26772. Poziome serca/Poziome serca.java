import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int j = 0; j < N; j++){
            sb.append(" @@@   @@@ " + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append("@   @ @   @" + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append("@    @    @" + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append("@         @" + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append(" @       @ " + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append("  @     @  " + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append("   @   @   " + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append("    @ @    " + " ");
        }

        sb.append("\n");

        for(int j = 0; j < N; j++){
            sb.append("     @     " + " ");
        }

        sb.append("\n");

        System.out.println(sb);
    }
}