import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";

        for(int i=0; i<15; i++) {
            String st = br.readLine();
            for(int j=0; j<29; j++){
                char t = st.charAt(j);
                if(t == 'w') {
                    answer = "chunbae";
                    break;
                }
                if(t == 'b') {
                    answer = "nabi";
                    break;
                }
                if(t == 'g') {
                    answer = "yeongcheol";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}