import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(str.charAt(0)=='C')
                answer++;
        }

        System.out.println(answer);
    }
}
