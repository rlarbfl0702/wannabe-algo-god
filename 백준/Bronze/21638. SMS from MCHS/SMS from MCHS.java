import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st1.nextToken());
        int v1 = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st2.nextToken());
        int v2 = Integer.parseInt(st2.nextToken());
        
        if (t2 < 0 && v2 >= 10) {
            System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
        } else if (t2 < t1) {
            System.out.println("MCHS warns! Low temperature is expected tomorrow.");
        } else if (v2 > v1) {
            System.out.println("MCHS warns! Strong wind is expected tomorrow.");
        } else {
            System.out.println("No message");
        }
    }
}