import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int plus = A-B;
        int day = V/plus + 1;

        int height = plus * day;

        while(true) {
            height += B;
            if(height < V) {
                break;
            }
            height -= A;
            day--;
        }
        System.out.println(day+1);
    }
}
