import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] apartment = new int[15][15];
        for(int i=1; i<15; i++) {
            apartment[0][i] = i;
        }
        for(int i=1; i<15; i++) {
            for(int j=1; j<15; j++) {
                for(int k=1; k<j+1; k++) {
                    apartment[i][j] += apartment[i-1][k];
                }
            }
        }
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apartment[k][n]).append('\n');
        }
        System.out.println(sb);
    }
}
