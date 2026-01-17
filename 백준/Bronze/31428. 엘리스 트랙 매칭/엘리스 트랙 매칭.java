import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        char sample = br.readLine().charAt(0);

        for(int i=0; i<N; i++){
            if(sample == st.nextToken().charAt(0)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}