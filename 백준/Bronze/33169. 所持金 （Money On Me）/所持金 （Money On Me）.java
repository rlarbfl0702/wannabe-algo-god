import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        answer += Integer.parseInt(br.readLine()) * 1000;
        answer += Integer.parseInt(br.readLine()) * 10000;

        System.out.println(answer);
    }
}