import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long answer = 1;
        for(int i=1; i<=N; i++) {
            answer *= i;
        }
        System.out.println(answer);
    }
}